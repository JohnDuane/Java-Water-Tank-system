import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Water waterTank = new Water(); // Default capacity of 1000
        
        System.out.println("Water Tank Management System");
        System.out.println("Default Capacity: " + waterTank.getCapacity() + " gallons");
        
        int userOption;
        do {
            // Display menu
            System.out.println("\nWater Tank");
            System.out.println("[1] Fill");
            System.out.println("[2] Drain");
            System.out.println("[3] Check Current Level");
            System.out.println("[4] Check if Empty");
            System.out.println("[5] Check if Full");
            System.out.println("[6] Exit");
            System.out.print("Choose an option: ");
            
            try {
                userOption = scanner.nextInt();
                
                switch (userOption) {
                    case 1: // Fill tank
                        System.out.print("Enter how many gallons to fill (MAXIMUM " + waterTank.getCapacity() + "): ");
                        double fillAmount = scanner.nextDouble();
                        try {
                            waterTank.fill(fillAmount);
                            System.out.println("Tank filled successfully.");
                            if (waterTank.isFull()) {
                                System.out.println("Tank is full now.");
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                        
                    case 2: // Drain tank
                        System.out.print("Enter how many gallons to drain: ");
                        double drainAmount = scanner.nextDouble();
                        try {
                            Double drained = waterTank.drain(drainAmount);
                            System.out.println("Tank drained successfully. Drained " + drained + " gallons.");
                            if (waterTank.isEmpty()) {
                                System.out.println("Tank is empty now.");
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                        
                    case 3: // Check current water level
                        System.out.println("Current level: " + waterTank.getLevel() + " gallons");
                        break;
                        
                    case 4: // Check if empty
                        if (waterTank.isEmpty()) {
                            System.out.println("The tank is empty.");
                        } else {
                            System.out.println("The tank is not empty.");
                        }
                        break;
                        
                    case 5: // Check if full
                        if (waterTank.isFull()) {
                            System.out.println("The tank is full.");
                        } else {
                            System.out.println("The tank is not full.");
                        }
                        break;
                        
                    case 6: // Exit program
                        System.out.println("Exiting the program...");
                        break;
                        
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
                userOption = 0; // Reset option to continue loop
            }
            
        } while (userOption != 6);
        
        scanner.close();
    }
}