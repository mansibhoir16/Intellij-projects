package Collections;

abstract class parent{
    public void greet() {
        System.out.println("Good morning");
    }

    public void greet2() {
        System.out.println("Good Night");
    }
}

class Child extends parent{
    @Override
    public void greet() {
        System.out.println("Good afternoon");
    }

}
public class AbstractClass {

    public static void main(String[] args) {
        Child child = new Child();
        child.greet();
    }
}
