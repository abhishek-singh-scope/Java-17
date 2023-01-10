package Java14;

//Records is a restricted form of class that is ideal for POJOs

record Location(double x, double y){}

//A record will acquire the getters and constructors at runtime.
//Also gets the equals(), hashcode() and toString() methods.

public class Records {

    public static void main(String[] args) {
        //Parameterized Constructors created automatically
        Location pune = new Location(18.51957,73.85535);

        System.out.println("Map coordinates of Pune - "+pune.x()+","+pune.y());
    }

}
