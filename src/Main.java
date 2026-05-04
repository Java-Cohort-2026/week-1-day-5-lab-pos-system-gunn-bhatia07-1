import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // This tool allows us to read what the user types on the keyboard
        Scanner scanner = new Scanner(System.in);
        
        double totalCost = 0.0;
        boolean isOrdering = true;

        System.out.println("Welcome to the Java Cafe POS System!");

        // TODO: Create a while loop that keeps running as long as isOrdering is true
        
        // INSIDE THE LOOP:
        // 1. Print the menu: 
        //    [1] Cold Brew ($4.50)
        //    [2] Iced Latte ($5.00)
        //    [0] Finish Order
        // 2. Get user input: int choice = scanner.nextInt();
        // 3. Use if/else to add the correct price to totalCost
        // 4. If they type 0, change isOrdering to false to break the loop!

        while(isOrdering) {
            System.out.println("MENU: ");
            System.out.println("[1] Cold Brew ($4.50)");
            System.out.println("[2] Iced Latte ($5.00)");
            System.out.println(" [0] Finish Order");

            System.out.println("What you want to order? :");

            int choice = scanner.nextInt();

            if(choice == 1) {
                totalCost += 4.50;
            }
            else if(choice == 2) {
                totalCost += 5.00;
            }
            else if(choice == 0) {
                isOrdering = false;
            }
            else {
                System.out.println("Invalid input");
            }
        }

        // --- FINAL OUTPUT ---
        // (Print this exactly after the loop finishes)
        System.out.println("Order complete! Your total is: $" + totalCost);
        
        scanner.close();
    }
}
