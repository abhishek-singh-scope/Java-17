package Java8;

import java.util.Objects;

public class Employee {

    String name;

    public Employee() {
    }

    String city;
    int age;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return age == employee.age && name.equals(employee.name) && city.equals(employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, age);
    }

    @Override
    public String toString() {
        return "BeyondJava8.Employee{" +
                "name='" + name + '\'' +
//                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
