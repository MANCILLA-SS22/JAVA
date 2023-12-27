package academy.learnprogramming;

public class Main 
{
    public static void main(String[] args) 
    {
        int topScore = 100;
        if(topScore != 100) 
        {
            System.out.println("You got the high score!");
        }
        
        int SecondTopScore = 81;
        if((topScore > SecondTopScore) && (topScore < 100)) 
        {
            System.out.println("Greater that second top score and less than 100");
        }

        if((topScore > 90) || (SecondTopScore <= 90)) 
        {
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if(!isCar)
        {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
        {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient==20)? true : false;
        if(isEighteenOrOver)
        {
            System.out.println("isEighteenOrOver is true");
        }

        
    }
    
}
