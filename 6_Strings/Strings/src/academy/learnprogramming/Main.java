package academy.learnprogramming;

public class Main {
    public static void main(String[] args) 
    {
        /*
         * Byte
         * Short
         * Int
         * Long
         * Float
         * Doule
         * Char
         * Boolean
         */ 

         String MyString = "This is a String";
         System.out.println("My string is equal to: "+ MyString);
         MyString = MyString+", and this is more.";
         System.out.println("\nMyString is equal to: "+ MyString);
         MyString = MyString+ " \u00A9 2022";
         System.out.println("\nMyString is equal to: "+ MyString);

         String NumberString = "250.55";
         NumberString = NumberString + "49.95";
         System.out.println("\n"+NumberString);

         String LastString = "10";
         int MyInt = 50;
         LastString = LastString + MyInt;
         System.out.println("\nLastString is equal to: "+ LastString);

         double DoubleNumber = 120.47d;
         LastString = LastString + DoubleNumber;
         System.out.println("\nLastString is equal to: "+ LastString);
         

    }
}
