import java.util.Scanner;

public class HigherLower{

    /**
     *
     * @param args none
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        int firstNum = generateNum();

        System.out.println("Number is " + firstNum + ", will the next number be higher or lower? (numbers range from 1-20):");

        while (!answer.equalsIgnoreCase("higher") && !answer.equalsIgnoreCase("lower")) {
            answer = scanner.next();
            if (!answer.equalsIgnoreCase("higher") && !answer.equalsIgnoreCase("lower")) {
                System.out.println("invalid response, try again");
            }
        }

        System.out.println("valid response");
        //if (answer.equalsIgnoreCase("higher") && ) {}

        scanner.close();
    }

    /**
     * Method to generate a number
     * @return generated integer
     */
    private static int generateNum() {
        return 0;
    }
}