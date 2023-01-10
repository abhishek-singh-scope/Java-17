package Java8.JavaCollection;

import java.util.*;

public class TestCollections{

    //Collections Class
    //sort,frequency,reverse,reverseOrder,

    public static void main(String[] args) {

        //#AsLifoQueue
        Deque<Integer> deque = new ArrayDeque<Integer>(7);

        // Adding element to deque
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);

        // get queue from the deque
        // using asLifoQueue() method
        Queue<Integer> nq = Collections.asLifoQueue(deque);

        // printing the Queue
        System.out.println("View of the queue is: " + nq);

        //#Frequency method
        ArrayList<String> list =
                new ArrayList<String>();
        list.add("Pune");
        list.add("Bangalore");
        list.add("Pune");
        list.add("Hyderabad");

        // count the frequency of the word "code"
        System.out.println("The frequency of Pune is: "+
                Collections.frequency(list, "Pune"));

        //#sort
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collection.sort() : " + al);

        //BinarySearch in Collections
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(10);
        nums.add(20);

        // 10 is present at index 3.
        int index = Collections.binarySearch(nums, 10);
        System.out.println(index);

        // 13 is not present. 13 would have been inserted
        // at position 4. So the function returns (-4-1)
        // which is -5.
        index = Collections.binarySearch(nums, 13);
        System.out.println(index);

        //TypeSafe view of Collection
        // Now create typesafe view of the collection by
        // creating object of Collection class of string
        // type
        Collection<String> tslst
                = Collections.checkedCollection(
                al, String.class);

        // Printing the updated ArrayList
        // after applying checkedCollection() method
        System.out.println("Typesafe view of List: "
                + tslst);

        //Copy Collections
//        Collections.copy(destlst, srclst);

        //Disjoint Collections
//        System.out.println("is mylist1 disjoint to mylist2 : " +
//                Collections.disjoint(mylist1, mylist2));

        //Collections fill
        List<String> arrlist = new ArrayList<String>();

        // Adding element to srclst
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");

        // print the elements
        System.out.println("List elements before fill: "
                + arrlist);

        // fill the list
        Collections.fill(arrlist, "TAJMAHAL");

        // print the elements
        System.out.println("\nList elements after fill: "
                + arrlist);

        //Max Collection
        System.out.println("Max value is: "
                + Collections.max(nums));

        //Rotate List
        Collections.rotate(list, 2);

        //Shuffle List
        Collections.shuffle(list);

            // Printing list after shuffling
            System.out.println("\nShuffled List : \n" + list);

        //Singleton set
        String[] geekslist = { "1", "2", "4", "2", "1", "2",
                "3", "1", "3", "4", "3", "3" };
        List geekslist2 = new ArrayList(Arrays.asList(geekslist));
        System.out.println("\nOriginal geeklist2: " + geekslist2);

        // Selectively delete "1" from
        // all it's occurrences
        geekslist2.removeAll(Collections.singleton("1"));
        System.out.println("geekslist2 after removal of 1 with "
                + "singleton:" + geekslist2);

        //Unmodifiable Collections
        try {

            // creating object of ArrayList<Character>
            List<Character> blist = new ArrayList<Character>();

            // populate the list
            blist.add('X');
            blist.add('Y');

            // printing the list
            System.out.println("Initial list: " + blist);

            // getting unmodifiable list
            // using unmodifiableCollection() method
            Collection<Character>
                    immutablelist = Collections
                    .unmodifiableCollection(blist);
        }
        catch (UnsupportedOperationException e) {

            System.out.println("Exception thrown : " + e);
        }

        //swap in Collections
        List<String> vector = new ArrayList<String>();

        // populate the vector
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");

        // printing the vector before swap
        System.out.println("Before swap: " + vector);

        // swap the elements
        System.out.println("\nSwapping 0th and 4th element.");
        Collections.swap(vector, 0, 4);
    }

}
