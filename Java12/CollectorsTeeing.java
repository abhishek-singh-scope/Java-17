package Java12;

import Java8.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsTeeing {

    static List<Employee> listEmp = Arrays.asList(
            new Employee("Akash","Pune",42),
            new Employee("Rakesh","Vizag",23),
            new Employee("Abhilash","Mumbai",32),
            new Employee("Hemangi","Chennai",29)
            );

        static HashMap<String,Employee> EmployeeAges = listEmp.stream().collect(Collectors.teeing(
                Collectors.maxBy((a,b)->a.getAge()-b.getAge()),
                Collectors.minBy(Comparator.comparing(Employee::getAge)),
                (e1,e2)->{
                    HashMap<String,Employee> map = new HashMap<>();
                    map.put("Youngest Employee Details",e1.get());
                    map.put("Eldest Employee Details",e2.get());
                    return map;
                }
        ));

    public static void main(String[] args) {

        System.out.println("Details of Youngest and Eldest Employee\n"+EmployeeAges);
    }
}
