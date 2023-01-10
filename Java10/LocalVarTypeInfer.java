package Java10;

public class LocalVarTypeInfer {

    public static void main(String[] args) {

        //var keyword can be used to infer any local datatype
        var id = 1;

        var name = "Abhishek";

        var age = 24;

        var salary = 909090909;

        System.out.println("ID: "+id+"\n"+"Name: "+name+"\n"+"Age: "+age+"\nSalary: "+salary);
    }
}
