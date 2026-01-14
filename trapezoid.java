import java.util.Scanner;

public class trapezoid {

   public static void main(String[] args) {

      // Question 6:
      // A quadrilateral with at least one pair of parallel sides
      // is called a trapezoid or trapezium. The area K of a trapezoid is given by K =
      // h * (a + b)/2, where a and b are the lengths of the parallel sides, h
      // is the height (the perpendicular distance between
      // these sides). Write a program that takes input lengths
      // of two parallel sides and the perpendicular distance
      // between these two parallel lines, and prints the area
      // of this trapezoid

      Scanner inpt = new Scanner(System.in);
      System.out.println("Enter the value of 1st parallel side which is a:");
      double a = inpt.nextDouble();

      System.out.println("Enter the value of 2nd parallel side which is b ");
      double b = inpt.nextDouble();


      System.out.println("Enter the value of perpendicular distance is : ");
      double h = inpt.nextDouble();

      double k = h * ((a + b) / 2);
      System.out.println("Area of Trapezoid:" + k);
   }
}
