/* Speed Converter
1.  Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. 
    This method needs to return the rounded value of the calculation of type long.
    If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
    Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below. 

2.  Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
    This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
    Then it needs to print a message in the format "XX km/h = YY mi/h".
    XX represents the original value kilometersPerHour.
    YY represents the rounded milesPerHour from the kilometersPerHour parameter.
    If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

    Use method Math.round to round the number of calculated miles per hour(double). The method round returns long.
*/

package com.MancillaChavez;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilometersPerHour;
        double kilometersPerHourx2;
        System.out.print("Type the value in kmph: "); kilometersPerHour = input.nextDouble();
        System.out.print("The rounded value is: "+ (int)toMilesPerHour(kilometersPerHour)+ "mph");

        System.out.print("\nType the new value in kmph: "); kilometersPerHourx2 = input.nextDouble();
        printConversion(kilometersPerHourx2);
        
        input.close();
    }

    public static double toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }else{
            kilometersPerHour = (long)kilometersPerHour*(1000/1609.34);
            System.out.println("The long type convertion is: "+ kilometersPerHour);
            return kilometersPerHour;
        }
    }

    public static void printConversion(double kilometersPerHourx2) {
        if (kilometersPerHourx2 < 0) {
            System.out.println("Invalid value");
        }else{
            double res;
            res = Math.round(kilometersPerHourx2*(1000/1609.34));
            System.out.println(kilometersPerHourx2+"km/h = "+ res+ "mi/h");
        }    
    }
}

