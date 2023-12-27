/* MegaBytes Converter

Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes 
from the kilobytes parameter. Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.

For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
If the parameter kiloBytes is less than 0 then print the text "Invalid Value".

TIP: Be extremely careful about spaces in the printed message. 
TIP: Use the remainder operator
TIP: 1 MB = 1024 KB
NOTE: Do not set kilobytes parameter value inside your method. 
NOTE: The solution will not be accepted if there are extra spaces.
NOTE: The printMegaBytesAndKiloBytes method  needs to be defined as public static ?like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */
package com.MancillaChavez;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kiloBytes;
        System.out.print("Type the kiloBytes value: "); kiloBytes = input.nextInt();
        printMegaBytesAndKiloBytes(kiloBytes);

        input.close();
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        
        if (kiloBytes < 0) {
            System.out.println("Invalid value !!");
        }
        System.out.println("The original value is: "+ kiloBytes);

        int megabytes;
        int remainingKilobytes;

        megabytes = kiloBytes/1024;
        System.out.println("MegaBytes: "+megabytes);

        remainingKilobytes = kiloBytes%1024;
        System.out.println("Remaining KiloBytes: "+remainingKilobytes);


    }
}

