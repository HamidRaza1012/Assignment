import java.util.Scanner;

public class Discount {
    
    public static void main(String[] args) {
             // Question 3:
        // Discounted Selling price is to be calculated if original selling price and
        // discount percentageis given. Write a program to calculate and print
        // discounted selling price of the user giventwo inputs (1) original selling
        // price and (2) discounted selling price

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Selling Price :");
        double sp=inp.nextDouble();
        
        System.out.println("Enter discount Price :");
        double dp=inp.nextDouble();

        double cal=(dp/100)*sp;
        double cp=sp-cal;

        System.out.println("Discounted Selling Price :"+ cp);

        inp.close();

    }
}
