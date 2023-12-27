/* Leap Year Calculator
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

To determine whether a year is a leap year, follow these steps: 
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

The following years are not leap years:
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
This is because they are evenly divisible by 100 but not by 400.

The following years are leap years:
1600, 2000, 2400
This is because they are evenly divisible by both 100 and 400.

NOTE: The method isLeapYear needs to be defined as public static ?like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
*/

package com.MancillaChavez;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        boolean leap_year = true;
        System.out.print("Type the year: "); year = input.nextInt();
        isLeapYear(year, leap_year);
        input.close();
    }

    public static void isLeapYear(int year, boolean leap_year) {
        if ( (year < 0) || (year > 9999) || (year%4 != 0 || year%400 != 0 || year%100 != 0) ) {
            leap_year = false;
        }else if (year%4 == 0 && year%400 == 0 && year%100 == 0) {
            leap_year = true;
        }

        if (leap_year) {
            System.out.println("Es un anio bisieto!!");
        }else{
            System.out.println("NO es un anio bisieto!!");
        }
    }
}
