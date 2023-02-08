import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner

        System.out.println("Please enter two numbers"); //Prompts user two enter two ints
        System.out.print("Number 1: "); //Number 1
        double number1 = scan.nextDouble(); //Reads in number 1
        System.out.print("Number 2: "); //Number 2
        double number2 = scan.nextDouble(); //Readsin number 2
        double sum = number1 + number2; //Adds together
        double difference = number1 - number2; //Subtracts the two numbers
        double multiplication = number1 * number2; //Multiplies the two numbers
        double division = number1/number2; //Divides the two numbers
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
            case 4: 
            if(number2 == 0){
                System.out.println("The quotient of " + number1 + " and " + number2 + " is undefined because " + number2 + " is zero. (Divide by zero not allowed)");
            }
            else{
                System.out.println("The quotient of " + number1 + " and " + number2 + " is " + division + ".");
                break;
            }
        }
        
    }
    
}