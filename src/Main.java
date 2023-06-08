import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0;
        double priceShipping = 0;
        double totalPrice = 0;
        String trash = ""; //bad input
        String prompt = "Enter the price of the item: ";

        System.out.println("Enter the price of the item: ");
        price = in.nextDouble();

        if(in.nextDouble() >= 100)
        {
            System.out.println("Shipping is free! Your total is " + price);
        }
        else if (price < 100)
        {
            System.out.println("Shipping is 2% of the item price.");
            priceShipping = price * 0.02;
            System.out.println("Shipping will cost " + priceShipping);
            totalPrice = price + priceShipping;
            System.out.println("Your total cost is " + totalPrice);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said price was: " + trash);
            System.out.println("Run the program again and enter a valid price.");
        }
    }
}