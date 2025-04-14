package Inheritance;

public class Main {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3,100,25);
        System.out.println("Before new speed update");
        System.out.println(mb.toString());
        System.out.println("After new speed update");
        mb.applyBrake(10);   // reduces speed by 10
        mb.speedUp(20);
        System.out.println(mb.toString());
    }
}
