package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLambdas {

    //includes Method References(::) introduced in Java 8
    //forEach on Collections (System.out::println)

    public static void main(String[] args) {

        List<Employee> listEmp= new ArrayList<Employee>();

        Employee e1 = new Employee("Abhilash","Pune",29);

        Employee e2 = new Employee("Saket","Nagpur",25);


        listEmp.add(e1);
        listEmp.add(e2);

        Collections.sort(listEmp,(a,b)->a.getAge() - b.getAge());//Comparator used as Lambdas;

        listEmp.forEach((x)->System.out.println(x));
    }

}
