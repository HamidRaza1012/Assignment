import java.util.Scanner;

public class OrignalPrice {
    public static void main(String[] args) {
        
        // Question 4:
        // Write a program to calculate and print the original selling price if the
        // discounted selling
        // price and discount percentage is entered by the user.


        Scanner inpt=new Scanner(System.in);
        System.out.println("Enter the Discount Price:");
        double dsp=inpt.nextDouble();

        System.out.println("Enter Discount Percentage:");
        double dp=inpt.nextDouble();

        double op=dsp/(1-dp/100);
        System.out.println("Orignal Price :" + op);

        inpt.close();
    }
    
}
