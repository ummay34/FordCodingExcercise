import java.util.Scanner;

public class FordExcercise {

    public static void main(String [] args) {

        while (true) {
            System.out.println("Hello, please enter a number!" + "\nTo quit the program, enter 'q'");

            //instantiate scanner
            Scanner inputScanner = new Scanner(System.in);

            //If user enters a number
            if (inputScanner.hasNextInt()) {

                //get number from the user
                int inputNum = inputScanner.nextInt();

                //if the number is divisible by both 3 and 5 print MustangBronco
                if (inputNum % 3 == 0 && inputNum % 5 == 0) {
                    System.out.println("MustangBronco\n");

                    //If the number is divisible by 3 print Mustang
                } else if (inputNum % 3 == 0) {
                    System.out.println("Mustang\n");

                    //If the number is divisible by 5 print bronco
                } else if (inputNum % 5 == 0) {
                    System.out.println("Bronco\n");

                    //For every other number print the number itself
                } else {
                    System.out.println(inputNum + "\n");
                }
            }
            //If user enters q, quit the program
            else if(inputScanner.hasNext("q")){
                break;
            }
        }
    }
}
