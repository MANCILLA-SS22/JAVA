package com.timbuchalka;

public class Main 
{
    public static void main(String[] args) 
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was "+ highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("German", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Mancilla", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Chavez", highScorePosition);
    }

     public static void displayHighScorePosition(String playerName, int highScorePosition) 
     {
        System.out.println(playerName+" Managed to get into position "+highScorePosition+" on the high score table.\n");   
     }

     public static int calculateHighScorePosition(int playerScore) 
     {
        /*if(playerScore >= 1000)
        {
            return 1;
        }else if(playerScore >= 500)
        {
            return 2;
        }else if(playerScore >= 100)
        {
            return 3;
        }else{
            return 4;
        } */

        int position = 4;

        if(playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if (playerScore > 100){
            position = 3;
        }
        return position;


        
     }
     
     public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

            if (gameOver) // if(gameOver)
            {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000; // finalScore = finalScorre + 1000;
                return finalScore;
            }
            return -1;// Colocamos -1 en caso de que no se encuentre ningun valor que se pueda
                      // retornar al ejecutar el if.
        } 







}

