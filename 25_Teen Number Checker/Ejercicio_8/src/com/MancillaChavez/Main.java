/* Teen Number Checker
We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

EXAMPLES OF INPUT/OUTPUT:
hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
*/

package com.MancillaChavez;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        boolean x = false;
        System.out.print("Type the first numer:"); num1 = input.nextInt();
        System.out.print("Type the second numer:"); num2 = input.nextInt();
        System.out.print("Type the third numer:"); num3 = input.nextInt();
        
        x = hasTeen(num1, num2, num3, x);

        if (x) {
            System.out.println("There is at least one number into the range");
        }else{
            System.out.println("This isn't inclusive");
        }

        input.close();
    }

    public static boolean hasTeen(int num1, int num2, int num3, boolean x) {
        if ( (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)){
            x = true;
        }
        return x;
    }
}
