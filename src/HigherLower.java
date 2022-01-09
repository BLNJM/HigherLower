import java.util.Scanner;

public class HigherLower{

    /**
     *
     * @param args none
     */
    public static void main(String[] args) {
        // generate necessary variables
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int firstNum = generateNum();

        // get user input for answer
        System.out.println("Number is " + firstNum + ", will the next number be higher or lower? (numbers range from 1-20):");
        while (!answer.equalsIgnoreCase("higher") && !answer.equalsIgnoreCase("lower")) {
            answer = scanner.next();
            if (!answer.equalsIgnoreCase("higher") && !answer.equalsIgnoreCase("lower")) {
                System.out.println("invalid response, try again");
            }
        }

        // generate second number
        int secondNum = generateNum();

        // game logic for higher choice
        if (answer.equalsIgnoreCase("higher")) {
            if (secondNum > firstNum){
                System.out.println("Second number is " + secondNum + " so you are correct");
            }
            else if (firstNum > secondNum) {
                System.out.println("Second number is " + secondNum + " so you are incorrect");
            }
            else {
                System.out.println("Second number is " + secondNum + " so you tied");
            }
        }

        // game logic for higher choice
        else if (answer.equalsIgnoreCase("lower")) {
            if (secondNum > firstNum){
                System.out.println("Second number is " + secondNum + " so you are incorrect");
            }
            else if (firstNum > secondNum) {
                System.out.println("Second number is " + secondNum + " so you are correct");
            }
            else {
                System.out.println("Second number is " + secondNum + " so you tied");
            }
        }

        // game end, close out program
        System.out.println("Thanks for playing!");
        scanner.close();
    }

    /**
     * Method to generate a number
     * @return generated integer
     */
    private static int generateNum() {
        return (int) (Math.random() * 20) +1;
    }
}