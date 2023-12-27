package academy.learnprogramming;

public class Main 
{
    public static void main(String[] args) 
    {
        int result = 1 + 2;
        System.out.println("1 + 2 = "+result);
        int previousResult = result;
        System.out.println("Previous result = "+previousResult);
        result = result - 1;
        System.out.println("3 - 1 = "+result);

        result = result * 10;
        System.out.println("2 * 10 = "+ result);

        result = result / 5;
        System.out.println("20 / 5 = "+result);

        result = result % 3;
        System.out.println("4 % 3 = "+result); //result = 1
        
        result++; 
        System.out.println("1 + 1 = "+result); //result = 2

        result--;
        System.out.println("2 - 1 = "+result); //result = 1

        result += 2;
        System.out.println("1 + 2 = "+result); //result = 3

        result *= 10;
        System.out.println("3 * 10 = "+result); //result = 30

        result /= 3;
        System.out.println("30 / 3 = "+result); //result = 10

        result -= 2;
        System.out.println("10 * 2 = "+result); //result = 8
    }
    
}
