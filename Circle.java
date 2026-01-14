import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a circle of radius:");
        double rad = inp.nextDouble();

        while (rad <= 0) {
            System.out.println("Enter a circle of radius:");
            rad = inp.nextDouble();
        }
        double cir = 2 * Math.PI * rad;

        double ara = Math.PI * rad * rad;
        System.out.println("The circumfrence of circle" + cir);
        System.out.println("The area of circle is :" + ara);
    }

}
