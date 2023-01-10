package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestGroupby {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Dipak", "Delhi", 21));
        emp.add(new Employee("Sumit", "Delhi", 21));
        emp.add(new Employee("Karan", "Delhi", 23));
        emp.add(new Employee("Mona", "Udaipur", 23));
        emp.add(new Employee("Rajesh", "Banglore", 23));
        emp.add(new Employee("Niraj", "Banglore", 31));

        Map<String, List<Employee>> citygroup= emp.stream().collect(Collectors.groupingBy(Employee::getCity));

        for(Map.Entry<String,List<Employee>> ment:citygroup.entrySet())
        {
            System.out.println(ment.getKey());
            for(Employee empl:ment.getValue())
            {
                System.out.println(empl);
            }
        }
    }
}
