import java.util.Scanner;


public class CalculatorMain {

    public static void main(String[] args) {
        int userOption = 0;
        Scanner input = new Scanner(System.in);

        while (userOption != 6) {

            System.out.println("calculator");
            System.out.println("[1]Add");
            System.out.println("[2]Subtract");
            System.out.println("[3]Multiply");
            System.out.println("[4]Divide");
            System.out.println("[5]Modulo");
            System.out.println("[6]Exit Program\n");
            System.out.print("Choose Option:");
            userOption = input.nextInt();

            switch (userOption) {
            case 1:
                System.out.println("Addition selected");
                System.out.print("Enter first number: ");
                int a1 = input.nextInt();
                System.out.print("Enter second number: ");
                int b1 = input.nextInt();
                calculator calc1 = new calculator(a1, b1);
                System.out.println("Result: " + calc1.add());
                break;

            case 2:
                System.out.println("Subtraction selected");
                System.out.print("Enter first number: ");
                int a2 = input.nextInt();
                System.out.print("Enter second number: ");
                int b2 = input.nextInt();
                calculator calc2 = new calculator(a2, b2);
                System.out.println("Result: " + calc2.subtract());
                break;

            case 3:
                System.out.println("Multiplication selected");
                System.out.print("Enter first number: ");
                int a3 = input.nextInt();
                System.out.print("Enter second number: ");
                int b3 = input.nextInt();
                calculator calc3 = new calculator(a3, b3);
                System.out.println("Result: " + calc3.multiply());
                break;

            case 4:
                System.out.println("Division selected");
                System.out.print("Enter first number: ");
                int a4 = input.nextInt();
                System.out.print("Enter second number: ");
                int b4 = input.nextInt();
                calculator calc4 = new calculator(a4, b4);
                try {
                    System.out.println("Result: " + calc4.divide());
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;

            case 5:
                System.out.println("Modulo selected");
                System.out.print("Enter first number: ");
                int a5 = input.nextInt();
                System.out.print("Enter second number: ");
                int b5 = input.nextInt();
                calculator calc5 = new calculator(a5, b5);
                System.out.println("Result: " + (a5 % b5));
                break;

            case 6:
                // exit
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid option! Try again.");
            }
        }
    }
}