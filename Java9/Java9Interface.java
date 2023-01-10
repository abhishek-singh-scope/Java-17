package Java9;

public interface Java9Interface {

    public static final int id  = 1;

    public void display();

    //From Java 9 Interfaces can contain private methods
    //If there is more than one default method that want to share the same logic then that common logic can be implemented in inteface using private methods
    private void displ(){
        System.out.println("Displaying inside Interface\nIntroduced in Java 9");
    }
}
