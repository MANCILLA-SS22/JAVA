package academy.learnprogramming;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the amount in Lb: ");
        double pound1, kg1;
        pound1 = in.nextDouble();
        kg1 = 0.45359237*pound1;
        System.out.println("The answer is: "+ kg1);
        in.close();
    }
    
}
