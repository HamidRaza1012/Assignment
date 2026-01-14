import java.util.Scanner;

public class Watt {
    public static void main(String[] args) {
        // Question 5:
        // Watts is the measure of power consumption of electrical appliances. Which can
        // be
        // calculated by using voltmeter and ammeter to read the voltage and ampere.
        // Write a
        // program that prints the Watts against the user given volt and ampere reading.

         Scanner inpt=new Scanner(System.in);

        System.out.println("Enter voltage:");
        double vlt=inpt.nextDouble();

        System.out.println("Enter Current:");
        double crnt=inpt.nextDouble();

        
        double watt=vlt*crnt;
        System.out.println("Watt :"+ watt);

    }
    
}
