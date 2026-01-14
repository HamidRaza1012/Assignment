import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your obtained Marks");
        double obt = scanner.nextDouble();
        

        System.out.println("Enter your Max Marks");
        double max = scanner.nextDouble();

        double ptg = (obt / max) * 100;

        System.out.println("your percentage is:" + ptg + "%");

      scanner.close();
       
        
    }
    
}
