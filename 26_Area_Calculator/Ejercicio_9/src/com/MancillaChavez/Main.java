/* Area Calculator
Write a method named area with one double parameter named radius.
The method needs to return a double value that represents the area of a circle.
If the parameter radius is negative then return -1.0 to represent an invalid value.
Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.
If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

Examples of input/output:
area(5.0); should return 78.53975
area(-1);  should return -1 since the parameter is negative
area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
area(-1.0, 4.0);  should return -1 since first the parameter is negative

TIP: ?The formula for calculating the area of a rectangle is x * y.
TIP: ?The formula for calculating a circle area is radius * radius * PI.
TIP: For PI use a constant from Math class e.g. Math.PI
*/

package com.MancillaChavez;
import java.util.Scanner;
import java.io.IOException;
import java.lang.Math;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        char letra;
        System.out.print("Choose the figure (c=circle, r=rectangle): "); 
        letra = (char)System.in.read();
        area (letra);

        input.close();
    }

    public static void area (char x) {
        Scanner input = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##.000"); 

        double radius, height, width;
        if (x == 'c' || x == 'C') {
            System.out.println("You have chose a circle");
            System.out.print("Now type the radius: "); radius = input.nextDouble();

            System.out.print("The circle area is: "+ f.format(areaCircle(radius)));
        } else if (x == 'r' || x == 'R') {
            
            System.out.println("You have chose a rectangle");
            System.out.print("Type the height: "); height = input.nextDouble();
            System.out.print("Type the width: "); width = input.nextDouble();

            System.out.print("The rectangle area is: "+ f.format(areaRectangle(height, width)));
        }else{
            System.out.println("Invalid Number!!");
        }

        
        input.close();
    }

    public static double areaCircle(double y) {
        double res;
        res = y*y*Math.PI;
        return res;
    }

    public static double areaRectangle(double a, double b) {
        double res;
        res = a*b;
        return res;
    }

    
    
}
