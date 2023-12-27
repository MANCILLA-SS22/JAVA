/* 
     * Create a method called getDurationString with two parameters, first parameter "minutes" and 2nd parameter "seconds".
     * You should validate that the first parameter minutes is >= 0.
     * You should validate that the second parameter minutes is >= 0 and <= 59.
     * The method should return "Invalid value" in the method if either of the above are not true.
     * If the parameter are valid then calculate how many hours, minutes and seconds equal the minutes passed to this method
     * and return that value as string in format "XXh YYm ZZs".
     * Create a second method of the same name but with only one parameter seconds.
     * Validate that it is >= 0, and return "Invalid value" if it is not true.
     * If it is valide, them how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that 
     * it can be calculate correctly.
     * Call both methods to print values to the console.
     */

package com.MancillaChavez;

public class Main {/* Cuando usamos “static final” se dice que creamos una constante de clase, un atributo común a todos los objetos de esa clase. */
   static final String INVALID_VALUE_MESSAGE = "Invalid value"; 
   public static void main(String[] args) {
      System.out.println(getDurationString(65, 45));
      System.out.println(getDurationString(3945L));
      System.out.println(getDurationString(-41));
   }

   private static String getDurationString(long minutes, long seconds)
   {
      if ((minutes < 0) || (seconds < 0) || (seconds >59))
      {
            return INVALID_VALUE_MESSAGE;
      }

      long hours = minutes / 60;
      long remainingMinutes = minutes % 60;
      
      String hoursString = hours + "h";
      if(hours < 10){
         hoursString = "0" + hoursString;
      }

      String minutesString = remainingMinutes + "m";
      if(remainingMinutes < 10){
         minutesString = "0" + minutesString;
      }

      String secondsString = seconds + "s";
      if(seconds < 10){
         secondsString = "0" + secondsString;
      }
      return hoursString + " "+ minutesString + " " + secondsString + " ";
   }

   private static String getDurationString(long seconds){
      if( (seconds < 0))
      {
         return INVALID_VALUE_MESSAGE;
      }
      long minutes = seconds / 60;
      long remaininSeconds = seconds % 60;
      return getDurationString(minutes, remaininSeconds);
   }
}

