/* Minutes To Years and Days Calculator
Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.

EXAMPLES OF INPUT/OUTPUT:
printYearsAndDays(525600);  ? should print "525600 min = 1 y and 0 d"
printYearsAndDays(1051200); ? should print "1051200 min = 2 y and 0 d"
printYearsAndDays(561600);  ? should print "561600 min = 1 y and 25 d"

1 hour = 60 minutes
1 day = 24 hours
1 year = 365 days
*/

package com.MancillaChavez;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long minutes;
        System.out.print("Type the amount of minutes: "); minutes = input.nextLong();
        printYearsAndDays(minutes);

        input.close();
    }

    public static void printYearsAndDays(long x) {
        int hours, days, year, remainingDays;

        if (x<0) {
            System.out.println("Invalid number!!");
        }

        hours = (int)x/60;
        days = hours/24;
        remainingDays = days%365;
        year = days/365;
        System.out.println(x+" min = "+ year+" years and "+remainingDays+" days");

    }
    
}
