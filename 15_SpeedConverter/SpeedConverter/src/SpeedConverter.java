public class SpeedConverter 
{

    public static long toMilesPerHour(double x) 
    {

        if(x < 0) 
        {
            return -1;
        }

        return Math.round(x / 1.609);
    }

    public static void printConversion(double x) 
    {
        if(x <0) 
        {
            System.out.println("Invalid Value");
        } 
        else 
        {
            long milesPerHour = toMilesPerHour(x);
            System.out.println(x +" km/h = " + milesPerHour + " mi/h");
        }
    }
}
