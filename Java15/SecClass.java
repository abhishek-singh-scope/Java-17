package Java15;

public final class SecClass implements TestSealed{
    //shows an error because TestSealed interface does not permit SecClass to implement itself;
    @Override
    public void test() {
        System.out.println("Testing sealed interface");
    }
}
