/* Barking Dog
We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
Write a method shouldWakeUp that has 2 parameters.
1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
In all other cases return false.
If the hourOfDay parameter is less than 0 or greater than 23 return false.

TIP: Use the if else statement with multiple conditions.
NOTE: The shouldWakeUp method  needs to be defined as public static ?like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
*/

package com.MancillaChavez;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean barking = false;
        int hourOfDay;

        System.out.print("Type the hour of the day between 0 and 23: "); hourOfDay = input.nextInt();
        shouldWakeUp(barking, hourOfDay);

        input.close();
    }

    public static void shouldWakeUp(boolean barking,int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay >= 24) {
            System.out.println("Invalid Value!!");
        }else if ( (hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24) ) {
            barking = true;
        }
        
        if (barking){
            System.out.println("We have to wake up!!");
        }else{
            System.out.println("We can continue sleeping.");
        }

    }
}

