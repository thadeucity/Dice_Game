import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;
        boolean validInput = false;
        boolean playing = false;

        Dice d1 = new Dice();
        Dice d2 = new Dice();

        while (!validInput){
            System.out.println("Want to play a dice game? (y/n) ");
            userInput = sc.next();
            if (userInput.equals("y")){
                validInput=true;
                playing = true;
                System.out.println("Ok, Let's start");
            } else if (userInput.equals("n")) {
                validInput=true;
                System.out.println("Ok, we can play it another time, thank you!");
            } else{
                System.out.println("Wrong input, try again");
            }
        }

        while (playing){

            validInput = false;

            d1.roll();
            d2.roll();

            System.out.print("\n" + d1.showResult());
            System.out.println("\n" + d2.showResult() + "\n");

            if (d1.showResult().equals(d2.showResult())){
                System.out.println("YOU WON! Want to play again? (y/n) ");
            } else {
                System.out.println("YOU LOST! Want to try again? (y/n) ");
            }

            while (!validInput){
                userInput = sc.next();
                if (userInput.equals("y")){
                    validInput=true;
                    System.out.println("Ok, Let's play again");
                } else if (userInput.equals("n")) {
                    validInput=true;
                    playing = false;
                    System.out.println("Ok, Thank you for playing!");
                } else{
                    System.out.println("Wrong input, try again");
                }
            }

        }

    }



}
