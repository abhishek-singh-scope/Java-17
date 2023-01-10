package Java16;

import Java8.Employee;

import java.util.Arrays;
import java.util.List;

//instead of using Collectors,toList() method we can directly use toList() method as a terminator to the stream
public class StreamsToList {

    public static void main(String[] args) {

        List<Employee> lemp = Arrays.asList(
                new Employee("Abhishek","Pune",24),
                new Employee("Rajesh","Jaipur",32),
                new Employee("Pratik","Nagpur",25)
        );

        List<Employee> youngsters = lemp.stream().filter(x->x.getAge()<30).toList();

        List<Integer> ages = lemp.stream().map(x->x.getAge()).toList();

        System.out.println("Unmarried Youngsters\n"+youngsters);

        System.out.println("All ages of Employees\n"+ages);
    }
}
