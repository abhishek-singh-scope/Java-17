package Java11;

import Java8.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalNewMethod {

    public static void main(String[] args) {

        Employee lemp = new Employee();
        Employee temp = null;
        Optional<Employee> opt = Optional.ofNullable(lemp);
        Optional<Employee> opt2 = Optional.ofNullable(temp);

        //isPresent method added in Optional class
        System.out.println(opt.isPresent());
        System.out.println(opt2.isPresent());
    }
}
