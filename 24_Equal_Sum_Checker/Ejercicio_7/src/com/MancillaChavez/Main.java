/* Equal Sum Checker
Write a method hasEqualSum with 3 parameters of type int.
The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.

EXAMPLES OF INPUT/OUTPUT:
hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0
*/

package com.MancillaChavez;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        boolean x = true;
        System.out.print("Type the first numer: "); num1 = input.nextInt();
        System.out.print("Type the second numer: "); num2 = input.nextInt();
        System.out.print("Type the third numer: "); num3 = input.nextInt();

        x = hasEqualSum(num1, num2, num3, x);

        if (x) {
            System.out.println("The sum of "+num1+" + "+ num2+" is equal to the third number ("+num3+")");
        }else{
            System.out.println("They are all different");
        }

        input.close();
    }

    public static boolean hasEqualSum(int num1, int num2, int num3, boolean x) {
        if ((num1 + num2) != num3) {
            x = false;
        }
        return x;
    }
}
