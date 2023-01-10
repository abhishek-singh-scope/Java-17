package Java8;

import java.util.Optional;

public class TestJavaOptionals {

    // Optional class - used to avoid NullPointerException

    public static void main(String[] args) {

        Employee emp1 = new Employee("Abhishek","Delhi",24);
        Employee emp2 = new Employee("Sanchit",null,25);

        Optional<Employee> emptyOpt = Optional.empty();
        System.out.println(emptyOpt);

//        Optional<String> optcity =  Optional.of(emp1.getCity());
//        System.out.println(optcity);

        Optional<String> nulloptcity = Optional.ofNullable(emp1.getCity());
        System.out.println(nulloptcity.get());

        Optional<String> nulloptcity1 = Optional.ofNullable(emp2.getCity());
//        if(nulloptcity1.isPresent())
//        System.out.println(nulloptcity1.orElse("Pune"));
//        System.out.println(nulloptcity1.orElseThrow(()->new IllegalArgumentException("Please Enter City")));
//        System.out.println(nulloptcity1.map(String::toUpperCase).orElseGet(()->"Enter City for BeyondJava8.Employee"));
        nulloptcity1.ifPresent((x)-> System.out.println(x));

    }
}
