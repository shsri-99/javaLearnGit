package Constructor;

public class Main {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor("Shruti ",25);
        System.out.println("This is parameterised constructor calling my name "+constructor2.name +"age "+ constructor2.age);
        Constructor constructor3 = new Constructor(constructor2);
        System.out.printf("Calling Copy constructor for %s and %d",constructor3.name,constructor3.age);
    }
}
