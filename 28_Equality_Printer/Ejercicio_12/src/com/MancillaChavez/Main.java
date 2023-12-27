/* Equality Printer
Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
If one of the parameters is less than 0, print text "Invalid Value".
If all numbers are equal print text "All numbers are equal"
If all numbers are different print text "All numbers are different".
Otherwise, print "Neither all are equal or different".

EXAMPLES OF INPUT/OUTPUT:
printEqual(1, 1, 1); should print text All numbers are equal
printEqual(1, 1, 2); should print text Neither all are equal or different
printEqual(-1, -1, -1); should print text Invalid Value
printEqual(1, 2, 3); should print text All numbers are different
*/

package com.MancillaChavez;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        System.out.print("Type the first numer: "); num1 = input.nextInt();
        System.out.print("Type the second numer: "); num2 = input.nextInt();
        System.out.print("Type the third numer: "); num3 = input.nextInt();
        printEqual(num1, num2, num3);
        input.close();
    }

    public static void printEqual(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3 && num1 == num3) {
            System.out.println("All numbers are equal");
        }else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All numbers are different");
        }else if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid number");
        }else if ((num1 == num2 && num1 != num3) || (num1 == num3 && num1 != num2) || (num2 == num3 && num2 != num1) ) {
            System.out.println("Neither all equal or different");
        }
    }
    
}
