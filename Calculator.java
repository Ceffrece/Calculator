import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner

        System.out.println("Please enter two whole numbers"); //Prompts user two enter two ints
        System.out.print("Number 1: "); //Number 1
        int number1 = scan.nextInt(); //Reads in number 1
        System.out.print("Number 2: "); //Number 2
        int number2 = scan.nextInt(); //Readsin number 2
        int sum = number1 + number2; //Adds together
        int difference = number1 - number2; //Subtracts the two numbers
        int multiplication = number1 * number2; //Multiplies the two numbers
        int division = number1/number2; //Divides the two numbers
        System.out.println("Would you like to: \n 1: Add \n 2: Subtract \n 3: Multiply \n 4: Divide");
        System.out.println("Choice> ");
        int choice1 = scan.nextInt();
        switch(choice1) {
            case 1: System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum + ".");
            break;
            case 2: System.out.println("The difference of " + number1 + " and " + number2 + " is " + difference + ".");
            break;
            case 3: System.out.println("The product of " + number1 + " and " + number2 + " is " + multiplication + ".");
            break;
            case 4: System.out.println("The quotient of " + number1 + " and " + number2 + " is " + division + ".");
            break;
        }
        
    }
    
}