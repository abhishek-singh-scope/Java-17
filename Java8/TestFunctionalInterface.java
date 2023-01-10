package Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestFunctionalInterface {

    //User Defined Functional Interface
    @FunctionalInterface
    interface Square{
        int calculate(int x);

        default void cube(int x){
            System.out.println(x*x*x);
        }

        static int getrandom(int x)
        {
            return (int)(1+(Math.random()*x));
        }
    }

/*  Inbuilt Java Functional Interface:

    Runnable - with only run() abstract method
    Comparable - with only compareTo() method
    ActionListener - with only actionPerformed() method
    Callable - with only call() method */


    public static void main(String[] args) {

        //Before Java 8 implementing interfaces using anonymous inner class

        //Calling User Defined Functional Interface and defining calculate abstract method using Lambdas
        Square s = (x) -> x*x;

        var sq= 2;
        System.out.println("local variable type inference in Java 10: "+sq);

        System.out.println(s.calculate(8));
        s.cube(3);

        //java.util.function package contains many built-in functional interfaces

        //Predicate - takes a parameter and returns a boolean - uses test() method
        //Bi - Predicate - takes two parameters
        Predicate<String> checkLength = str->str.length()>5;
        System.out.println(checkLength.test("Abhishek"));
        System.out.println(checkLength.test("Sam"));

        Predicate<Integer> validAge = x->x<150 && x>0;
        System.out.println(validAge.test(200));

        //Consumer - prints the value passed as a parameter/modifies data, no output - uses accept() function
        //Bi - Consumer - takes two parameters
        Consumer<String> displayname = x -> System.out.println("My name is: "+x);
        displayname.accept("Abhishek");

        //Function - takes a parameter, does some processing and returns an output -uses apply() method
        Function<Integer, Integer> convertDollar = Square::getrandom;
                //x -> x + " x 81 = " + x*81;
        System.out.println(convertDollar.apply(10));

        //Supplier - does not take any input yet returns a single output - used for defining the
        //logic for generation of any sequence - uses get() method
        Supplier<Double> getrandomDouble = ()->Math.random();
        System.out.println(String.format("%.2f",getrandomDouble.get()));

        Supplier<Integer> get2digrandomNum = ()-> (int)(Math.random()*100);
        System.out.println(get2digrandomNum.get());

    }
}
