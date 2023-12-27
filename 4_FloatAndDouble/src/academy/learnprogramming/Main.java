package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        float MyMinFloatValue = Float.MIN_VALUE;
        float MyMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+MyMinFloatValue);
        System.out.println("Float minimum value = "+MyMaxFloatValue);

        double MyMinDoubleValue = Float.MIN_VALUE;
        double MyMaxDoubleValue = Float.MAX_VALUE;
        System.out.println("Double minimum value = "+MyMinDoubleValue);
        System.out.println("Double minimum value = "+MyMaxDoubleValue);


        int MyIntValue = 5 / 2;
        float MyFloatValue = 5f / 2f;
        double MyDoubleValue = 5d / 2d;
        System.out.println("MyIntValue= "+MyIntValue);
        System.out.println("MyFloatValue= "+MyFloatValue);
        System.out.println("MyDoubleValue= "+MyDoubleValue);
         */

        Scanner var1 = new Scanner(System.in);
        System.out.println("Choose the amount in Lb: ");
        double pound1, kg1;
        pound1 = var1.nextDouble();
        kg1 = 0.45359237*pound1;
        System.out.println("The answer is: "+ kg1);
    }
}
