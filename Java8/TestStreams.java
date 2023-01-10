package Java8;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreams {

    //includes Streams.toList() introduced in Java16 but it won't work because JDK 11 is used.

    //includes Stream.ofNullable() - which can be used to return an empty stream introduced in Java 9

    public static void main(String[] args) {

        Transaction t1 = new Transaction(1000, Type.CREDIT, 1);
        Transaction t2 = new Transaction(2000, Type.DEBIT, 2);
        Transaction t3 = new Transaction(4500, Type.CREDIT, 3);
        Transaction t4 = new Transaction(6000, Type.DEBIT, 4);
        Transaction t5 = new Transaction(8900, Type.CREDIT, 5);

        List<Transaction> translist = new ArrayList<>();
        translist.add(t1);
        translist.add(t2);
        translist.add(t3);
        translist.add(t4);
        translist.add(t5);

        //If Collections is used
        Stream<Transaction> transtream = translist.stream();
        System.out.println("Using stream method of Collections");
        transtream.forEach(x-> System.out.println(x.id +" - "+x.amount));

        //If Arrays of Objects are used
        Transaction arr[] = new Transaction[]{t1,t2,t3,t4,t5};
        Stream<Transaction> fullarrStream = Arrays.stream(arr);
        System.out.println("Stream of Full Array");
        fullarrStream.forEach(x-> System.out.println(x.id+" - " + x.amount));

        Stream<Transaction> partarrStream = Arrays.stream(arr,1,4);
        System.out.println("Stream of Part Array");
        partarrStream.forEach(x-> System.out.println(x.id+" - "+x.amount));

        //Using Stream.of method by adding each object
        Stream<Transaction> streamfromObject = Stream.of(t1,t2,t3,t4,t5);
        System.out.println("Creating Stream of Objects");
        streamfromObject.forEach(System.out::println);

        //Stream.of method on BuiltIn Wrapper Classes
        Integer intarr[] = {1,46,686,43,534,42,442,42};
        Stream<Integer> intstream = Stream.of(intarr);
        System.out.println("Stream of Integer");
        intstream.forEach(System.out::println);

        //Infinite Stream
        Stream<Double> generatedStream = Stream.generate(Math::random).limit(5);
        generatedStream.forEach(System.out::println);

        Stream<Integer> iteratedStream = Stream.iterate(31,x->x+2).limit(7);
        iteratedStream.forEach(x-> System.out.println(x));

        //Regex in Streams
        System.out.println("Streams using Regex");
        Stream<String> splitStream = Pattern.compile("#").splitAsStream("Mon#Tue#Wed#Thur#Fri#Sat#Sun");
        splitStream.forEach(System.out::println);

        //Intermediate Operation
        //Filter
        System.out.println("BeyondJava8.Transaction Id of Debit BeyondJava8.Type");
        Stream<Transaction> debittrans = translist.stream().filter(t->t.type==Type.DEBIT);
        debittrans.forEach(x-> System.out.println(x));
        //This will generate an error as two terminal operations are not allowed
        // System.out.println("Total Debit BeyondJava8.Transaction: "+debittrans.count());

        //Map
        System.out.println("Getting only Amount using Map in Streams");
        translist.stream().map((t)->{
//            System.out.println(t.id + " - "+t.amount);
            return t.getAmount();
        }).forEach(x-> System.out.println("BeyondJava8.Transaction Amount: "+x));

        //Chaining Filter and Map
        System.out.println("Filtering out only Credit Transactions and getting only Amount");
        translist.stream()
                .filter(t->t.getType()==Type.CREDIT)
                .map(t->t.getAmount())
                .forEach(x-> System.out.println(x));

        //Sorted operation
        translist.stream()
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
//                .sorted((a,b)->b.getAmount()-a.getAmount())
                .forEach(System.out::println);

        //Terminal Operations - forEach and count already done
        //collect method
        Map<Type,Long> sumType = translist.stream()
                .collect(Collectors.groupingBy(Transaction::getType,
                        Collectors.summingLong(Transaction::getAmount)));

        System.out.println(sumType);

        System.out.println(translist.stream()
                .collect(Collectors.groupingBy(Transaction::getType,
                        Collectors.summarizingLong(Transaction::getAmount))));

        System.out.println("Stream converted to List");
        List<Integer> amountStream = translist.stream()
                .map(x->x.getAmount())
                .collect(Collectors.toList());

        System.out.println(amountStream);

        System.out.println("Collectors to TreeSet Collection");
        Set<Type> typeset = translist.stream()
                .map(Transaction::getType)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(typeset);

        String joined = translist.stream()
                .map(Transaction::getId)
                .map(Object::toString)
                .collect(Collectors.joining(" Added In Between "));
        System.out.println(joined);

        Integer debitsum = translist.stream()
                .filter(x->x.getType()==Type.DEBIT)
//                .map(BeyondJava8.Transaction::getAmount)
                .collect(Collectors.summingInt(Transaction::getAmount));
        System.out.println("Debit Sum: "+debitsum);



    }
}
