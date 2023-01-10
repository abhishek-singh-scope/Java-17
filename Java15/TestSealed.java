package Java15;

public sealed interface TestSealed permits FirstClass, SecClass {
    //shows an error because SecClass is trying to implement TestSealed Inteface which only permits FirstClass
    public void test();
}
