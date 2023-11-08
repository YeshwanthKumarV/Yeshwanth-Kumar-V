package newActivity1;

import java.util.Scanner;

public class ScannerLaptopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Enter Option:");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Even/Odd Number");
            System.out.println("5 - Quit");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter two numbers to be added:");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    int result = num1 + num2;
                    System.out.println("The result is " + result);
                    break;
                case 2:
                    System.out.println("Enter two numbers to be subtracted:");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    result = num1 - num2;
                    System.out.println("The result is " + result);
                    break;
                case 3:
                    System.out.println("Enter two numbers to be multiplied:");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    result = num1 + num2;
                    System.out.println("The result is " + result);
                    break;
                case 4:
                    System.out.println("Enter a number to check even or odd:");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println("The number is even.");
                    } else {
                        System.out.println("The number is odd.");
                    }
                    break;
                case 5:
                    System.out.println("Program terminated.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        } while (option != 5);

        
    }
}