
package test;

import java.util.Scanner;

interface iFine {
public void printFIne();
}

    abstract class Fine implements iFine {

}

        class SpeedingFines extends Fine {
            private String name;
            private int speed;

public SpeedingFines(String aName, int aSpeed) {
        super();
                name = aName;
                speed = aSpeed;
}

public double calculateFine() {
            if (speed < 120)
    return 0;
            else
    return speed * 10.20;
}

public void printFIne() {
            System.out.println("Name: " + name);
            System.out.println("Speed: " + speed+" km");
            System.out.println("The fine is: R"+calculateFine());
            System.out.println("------------------");
}

}

public class TestFines {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
            System.out.print("Enter persons name: ");
        String name=sc.next();
            System.out.print("Enter speed: ");
        int speed=sc.nextInt();
        System.out.println("------------------");
SpeedingFines sp = new SpeedingFines(name, speed);
            sp.printFIne();
}
}

