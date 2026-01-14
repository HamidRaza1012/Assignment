import java.util.Scanner;

public class triangle {
   public static void main(String[] args) {


    // Question 8:
        // Area of a triangle can be calculated if lengths of
        // its three sides is known by using the Heron’s
        // formula which says that Square root of
        // (s(s−a)(s−b)(s−c)) where s is half of the
        // perimeter of the triangle that can be calculated
        // by adding length of all the three sides and then
        // dividing it by 2.

       Scanner inpt=new Scanner(System.in);
        System.out.println("Enter length a:");
        double a=inpt.nextDouble();

        System.out.println("Enter length b:");
        double b=inpt.nextDouble();

        System.out.println("Enter length c:");
        double c=inpt.nextDouble();

        double s=(a+b+c)/2;
        double d=s*(s-a)*(s-b)*(s-c);
        double e=Math.sqrt(d);


        System.out.println("Area of triangle is :" + e);


     
   }
    
}
