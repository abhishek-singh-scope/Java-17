package Java17;


import Java8.Employee;

import java.util.List;

public class NewSwitchCase {

    static String cat = "";
    static void showAgeGroups(Employee emp){
        int age = emp.getAge();
        System.out.println(switch(age){
            case (21) -> "Teenager";
            case (24) -> "Millenial";
            case (26) -> "Married";
            default -> "Seniors";
        });

       cat =  switch(age){
           case (21) -> "Teenager";
           case (24) ->{ System.out.println("Displaying Message as well as returning value");
           yield "Millenial";}
           case (26) -> "Married";
           default -> "Seniors";
       };
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Singh","Pune",24);
        showAgeGroups(e1);

        System.out.println("Returning value to a string: "+cat);
    }
}
