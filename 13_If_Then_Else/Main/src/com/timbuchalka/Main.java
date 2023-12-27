package com.timbuchalka;

public class Main 
{
    public static void main(String[] args) 
    {
       boolean gameOver = true;
       int score = 800;
       int levelCompleted = 5;
       int bonus = 100;

       calculateScore(gameOver, score, levelCompleted, bonus);

       score = 10000;
       levelCompleted = 8;
       bonus = 200;

       calculateScore(gameOver, score, levelCompleted, bonus);

    }

       public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) 
       {

        if (gameOver == true) // if(gameOver)
        {
           int finalScore = score + (levelCompleted * bonus);
           finalScore += 2000; // finalScore = finalScorre + 1000; 
           System.out.println("Your final score was " + finalScore);
           return finalScore;
        }
        return -1;// Colocamos -1 en caso de que no se encuentre ningun valor que se pueda retornar al ejecutar el if.
       }

       /*
        * public static int calculateScore(boolean gameOver, int score, int
        * levelCompleted, int bonus)
        * {
        * 
        * if (gameOver == true) // if(gameOver)
        * {
        * int finalScore = score + (levelCompleted * bonus);
        * finalScore += 2000; // finalScore = finalScorre + 1000;
        * System.out.println("Your final score was " + finalScore);
        * return finalScore;
        * } else{
            return -1;
            }
          }
        */

       /*
        * public static void calculateScore(boolean gameOver, int score, int
        * levelCompleted, int bonus)
        * {
        * 
        * if (gameOver == true) // if(gameOver)
        * {
        * int finalScore = score + (levelCompleted * bonus);
        * finalScore += 1000; // finalScore = finalScorre + 1000;
        * System.out.println("Your final score was " + finalScore);
        * }
        * }
        */
    
}








/*
 * score = 10000;
 * levelCompleted = 8;
 * bonus = 200;
 * 
 * if (gameOver == true) // if(gameOver)
 * {
 * int finalScore = score + (levelCompleted * bonus);
 * System.out.println("Your final score was " + finalScore);
 * }
 * 
 */



/*
 * if (score <5000 && score > 1000)
 * {
 * System.out.println("Your score was less than 5000 but greater than 1000");
 * }
 * else if(score <1000)
 * {
 * System.out.println("Got here");
 * }
 */

/*
 * Print out a second score on the screen with the following score set to 10000,
 * levelCompleted set to 8 and bonus set to 200.
 * But make sure the first print out above still displays as well.
 * 
 * boolean newGameOver = true;
 * int newScore = 10000;
 * int newLevelCompleted = 8;
 * int newBonus = 200;
 * 
 * if(newGameOver == true) // if(gameOver)
 * {
 * int newFinalScore = newScore + (newLevelCompleted * newBonus);
 * System.out.println("Your final score was " + newFinalScore);
 * }
 */
