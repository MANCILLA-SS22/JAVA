/* DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

 */

package com.MancillaChavez;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        boolean x = true;
        boolean res = true;

        System.out.print("Type the first number: "); num1 = input.nextDouble();
        System.out.print("Type the second number: "); num2 = input.nextDouble();
        res = areEqualByThreeDecimalPlaces(num1, num2, x);

        if (res) {
            System.out.print("Both numbers are the same.");
        }else{
            System.out.print("They are different.");
        }

        input.close();
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2, boolean x) {
        num1 = Math.round(num1*1000);
        num2 = Math.round(num2*1000); 

        if ( (num1 - num2) == 0 || (num2 - num1) == 0 ) {
            x = true;
        }else{
            x = false;
        }
        return x;
    }
}
