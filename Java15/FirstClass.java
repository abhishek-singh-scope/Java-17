package Java15;

//Sealed is a modifier we can add to class or interface
public final class FirstClass implements TestSealed {
    //final keyword is used so that it stops the class from further extension
    @Override
    public void test() {
        System.out.println("Testing sealed Interface");
    }
}
