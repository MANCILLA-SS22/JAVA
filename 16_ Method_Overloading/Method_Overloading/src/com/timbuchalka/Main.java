/*
     * Create a method called calcFeetAndInchesToCentimeters. It neeeds to have 2 parameters.
     * feet is the first parameter, inches is the second parameter.
     * You should validate that the first parameter feet is >=0
     * You should validate that the second parameter inches is >=0 and <=12
     * return -1 from the method if either of the above is not true.
     * If the parameters are valid, then calculate how many centimetres comrpise the feet and inches passed to this method and return that value.
     * Create a second method of the same name but with only one parameter
     * inches is the parameter
     * validate that it's >=0
     * return -1 if it's not true
     * But if it's valid, then calculate how many feet are in the inches.
     * Call the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly
     * hints: Use double for your number datatypes is probably a good idea.
     * 1 inch = 2.54cm and one foot = 12 inches
     * Calling another overloaded method just requieres you tu use the right number of parameters.
*/

package com.timbuchalka;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        double feet;       // 30
        double inches;      // 5
        double inchesx2;  // 200
        double centimetres;

        System.out.print("Type the value in feets: "); feet = entrada.nextDouble();
        System.out.print("Type the value in inches: "); inches = entrada.nextDouble();        
        centimetres = calcFeetAndInchesToCentimeters(feet, inches);
        if (centimetres < 0.0) {
            System.out.print("First parameter is invalid, try again.");
        }else{
            System.out.print("The answer of "+ inches+ " + "+ feet+ " is equal to: "+ centimetres+"cm");
        }

        System.out.println("\n");

        System.out.print("Now type the second value in feets: "); inchesx2 = entrada.nextDouble();
        System.out.print("The answer is: "+ calcFeetAndInchesToCentimeters(inchesx2)+"cm");


        entrada.close();
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double cm = (feet * 12) * 2.54;
        cm += inches * 2.54;
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double res;
        double feet = (int) inches / 12; // Colocamos (int) antes de la variable siempre y cuando queramos cambiar el tipo de dato numerico
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " Inches is equal to " + feet + " feet and " + remainingInches + " Inches");
        res = calcFeetAndInchesToCentimeters(feet, remainingInches);
        return res;
    }

    /************************************************************************************************************************* */

    /* int newScore = calculateScore("German", 500);
    System.out.println("New score is"+ newScore);
    calculateScore(75);
    calculateScore();

    
    public static int calculateScore(String playerName, int score){
    System.out.println("Player "+ playerName+ " scored "+ score+ " points");
    return score * 100;
    }
    
    public static int calculateScore(int score){
    System.out.println("Unnamed player scored "+ score+ " points");
    return score * 100;
    
    }
    
    public static int calculateScore(){
    System.out.println("No player name, no player score");
    return 0;
    } */
    

}
