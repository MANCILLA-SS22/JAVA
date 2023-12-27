package com.timbuchalka;

public class Main {
    public static void main(String[] args) 
    {
        /* int switchValue = 1;
        switch(switchValue)
        {
            case 1:
            System.out.println("Value was 1");
            break;

            case 2:
            System.out.println("Value Was 2");
            break;

            case 3: case 4: case 5:
            System.out.println("Was not 3 or 4 or 5");
            System.out.println("Actually it was a "+ switchValue);
            break;

            default:
            System.out.println("Was not 1 or 2");
            break;
        } */

        /* 
         * Create a new switch statement using char instead of int 
         * Create a new char variable
         * Create a swich statement testing for A, B, C, D or E
         * Display a message if any of these are found and then break
         * Add a default which displays a message saying not fount
        */
        char charValue = 'A';
        switch(charValue)
        {
            case 'A':
            System.out.println("A was found");
            break;

            case 'B':
            System.out.println("B was found");
            break;

            case 'C': case 'D': case 'E':
            System.out.println(charValue+ "was found");
            break;

            default:
            System.out.println("Could not find A, B, C, D, or E");
            break;

        }

        String month = "JUNE";
        /* switch(month.toUpperCase()) */
        switch(month.toLowerCase())
        {
            case "january":
            System.out.println("Jan");
            break;

            case "june":
            System.out.println("Jun");
            break;

            default:
            System.out.println("Not sure");
        }
    }

}
