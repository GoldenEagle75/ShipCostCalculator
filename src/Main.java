import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double orderPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;
        String trash = "";
        System.out.print("Enter the price of your order: ");
        if (in.hasNextDouble()){
            orderPrice = in.nextDouble();
            in.nextLine();
            if (orderPrice >= 100){
                System.out.println("Free shipping! Your total is " + orderPrice + ".");
            }
            else {
                shippingCost = 0.02 * orderPrice;
                totalPrice = orderPrice + shippingCost;
                System.out.println("Shipping is " + shippingCost + ", bringing your total to " + totalPrice + ".");
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("You need to enter a valid number, not " + trash + ".");
        }
    }
}