import java.util.Random;

public class Dice {

    public String[] results = {
            ".-------.\n|       |\n|   o   |\n|       |\n*-------*",
            ".-------.\n|o      |\n|       |\n|      o|\n*-------*",
            ".-------.\n|      o|\n|   o   |\n|o      |\n*-------*",
            ".-------.\n|o     o|\n|       |\n|o     o|\n*-------*",
            ".-------.\n|o     o|\n|   o   |\n|o     o|\n*-------*",
            ".-------.\n|o  o  o|\n|       |\n|o  o  o|\n*-------*"
            };

    private int diceUp;

    public void roll(){
        Random rand = new Random();
        diceUp = rand.nextInt(6);
    }

    public String showResult(){
        return results[diceUp];
    }


}
