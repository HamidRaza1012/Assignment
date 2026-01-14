import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner inpt=new Scanner(System.in);

        System.out.println("Enter Integar Number:");
        int num=inpt.nextInt();

        if(num%2==0)
            System.out.println("Number is Even :" +num);
        
        if(num%2!=0)
            System.out.println("Number is odd :" + num);
    }
    
}
