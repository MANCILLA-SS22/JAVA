/* Playing Cat
The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). 
Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false
1st parameter should be of type boolean and be named summer it represents if it is summer.
2nd parameter represents the temperature and is of type int with the name temperature.

EXAMPLES OF INPUT/OUTPUT:
isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45 
isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
isCatPlaying(false, 35); should return true since temperature is in range 25 - 35 
*/

package com.MancillaChavez;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hour;
        boolean summer, res;
        System.out.print("Type the hour: "); hour = input.nextInt();
        System.out.print("Is it summer? (true = yes, false = no)"); summer = input.nextBoolean();
        res = isCatPlaying(summer, hour);

        if (res) {
            System.out.println("It's a nice season");
        }else{
            System.out.println("Not a nice season");
        }
        

        input.close();
    }

    public static boolean isCatPlaying(boolean summer, int hour) {

        if ( (summer==true && (hour>24 && hour<46)) || (summer == false && (hour>24 && hour<36)) ) {
            return true;
        }else{
            return false;
        }
    }
}
