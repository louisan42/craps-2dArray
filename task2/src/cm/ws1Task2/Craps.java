

package cm.ws1Task2;
import java.lang.Math;


public class Craps {

    int diceOne;
    int diceTwo;
    int sum;

    public void rollDice() {

        diceOne = (int)(Math.random() * 6) + 1;
        diceTwo = (int)(Math.random() * 6) + 1;
        sum = diceOne + diceTwo;
        System.out.println("You rolled " + diceOne + " + " + diceTwo + " = " + sum);

    }

    private void pressEnterToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    public static void main(String[] args) {

        Craps crapsGame = new Craps();
        crapsGame.rollDice();

        if(crapsGame.sum == 2 || crapsGame.sum == 3 || crapsGame.sum == 12){
            System.out.println("Craps,Better Luck next time, You Lose");
        }
        else if(crapsGame.sum == 7 || crapsGame.sum == 11){
            System.out.println("Congratulations!, You win");
        } else {
            System.out.println("Point established, set to " + crapsGame.sum);
            crapsGame.pressEnterToContinue();
            int numOfTries = 1;
            int establishedPoint = crapsGame.sum;
            for (int i = 0; i <= numOfTries; i++){
                crapsGame.rollDice();
                if(crapsGame.sum == 7){
                    System.out.println("Craps,Better Luck next time, You Lose");
                    break;
                }
                else if(crapsGame.sum == establishedPoint){
                    System.out.println("Congratulations!, You win");
                    break;
                } else {

                    numOfTries++;

                }
                crapsGame.pressEnterToContinue();


            }

        }


    }
}
