package Java8.JavaCollection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;

import Java8.Employee;

public class StreamsonCollection {

    public static void main(String[] args) {


        int[] test1 = {1,431,62,624,263,5634,64,34,643,36,643,346,6334,6,432,7,8};

        List<Employee> lemp= Arrays.asList(
            new Employee("AbhiSingh","Pune",24),
            new Employee("Rakesh","Vizag",25),
            new Employee("Rafael","NewYork",44),
            new Employee("Shinzo","Tokyo",35)
        );
        
        List<Integer> arr = Arrays.asList(1,34,5,35,5365,573,74375,73,32,432,25,6);

        List<Integer> convtoList = Arrays.stream(test1).sorted().boxed().toList();

        arr.stream().filter(x->x<25).forEach(System.out::println);

        System.out.println(convtoList);
    }
}