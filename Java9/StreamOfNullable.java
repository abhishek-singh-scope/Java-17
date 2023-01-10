package Java9;

import Java8.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfNullable {

    public static void main(String[] args) {

        List<Employee> lemp = new ArrayList<>();

        lemp.add(new Employee("Ayesha","Mumbai",24));

        lemp.add(new Employee());

        lemp.add(null);

        Stream.ofNullable(lemp).forEach((x)->System.out.println(x));
        //Above is a stream of Nullable

    }
}
