/* 
 * 1. Write a method called toMilePerHour that has 1 parameter of type double with the name kilometersPerHor. 
 * This method needs to return the rounded value of the calculation of type long.
 * If the parameter kilometerPerHour is less than 0, the method yoMilesPerHour needs to return -1 to indicate an invalid value.
 * Otherwise, if it is possible, calculate the value of miles per hour, round it and return it. 
 * 
 * 2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
 * This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
 * Then it needs to print a message in the format "XX km/h = YYmi/h"
 * If the parameter kilometerPerHour is < 0 then print the text Invalid Value"
*/

public class Main {

    public static void main(String[] args) 
    {
        double x = 10.5;
        long miles = SpeedConverter.toMilesPerHour(x);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(x);
    }
}
