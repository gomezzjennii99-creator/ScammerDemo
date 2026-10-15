import java.util.Scanner;
import java.util.Scanner;


public class ScannerApp {

    public static void main(String[] args){

        //created a scanner for me to use
        // getting input from the keyboard in the terminal
        //we can use this as many times as we want
        Scanner theScanner = new Scanner(System.in);

        System.out.println("what year is it?");

        int year = theScanner.nextInt();

        // because
        // i need to eat the newline charecter
        theScanner.nextLine();

        //I want to ask the use a question so they know what input to give me
        System.out.println("please enter your name: ");

        //capture the answer from the user
        String firstName = theScanner.nextLine();

        //ask the user another qeustion
        System.out.println("Please enter your last name: ");

        String lastName = theScanner.nextLine();

        //ask the user what their luck number is
        System.out.println("what's your lucky number?");





    }



}
