/*  Positive, Negative or Zero
Write a method called checkNumber with an int parameter number.

The method should not return any value, and it needs to print out:
"positive" if the parameter number is > 0
"negative" if the parameter number is < 0
"zero" if the parameter number is equal to 0
 */

package com.MancillaChavez;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int num;
        System.out.print("Type any number: ");
        num = input.nextInt();
        checkNumber(num);

        input.close();
    }



    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.print("It's a positive value");
        }else if (num<0) {
            System.out.print("It's a negativa value");
        }else{
            System.out.print("It's equal to 0");
        }
    }
}


