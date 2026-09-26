import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args) {
        //num itemPrice
        //num shippingCost
        //num totalPrice
        //output “what is the price of your item?”
        //input itemPrice
        //if itemPrice >= 100 then
        //shippingCost = 0
        //totalPrice = shippingCost + itemPrice
        //output “Your total price is” + totalPrice
        //output “Your shipping cost was” + shippingCost
        //else
        //shippingCost = 0.02 * itemPrice
        //totalPrice = shippingCost + itemPrice
        //output “Your total price is” + totalPrice
        //output “Your shipping cost was” + shippingCost
        //end if
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;
        System.out.print("What is the price of your item? ");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
        } else {
            System.out.print("Please enter a valid price");
        }
        if (itemPrice >= 100) {
            shippingCost = 0;
            totalPrice = shippingCost + itemPrice;
            System.out.println("The total cost of your item including shipping is " + totalPrice + " and your shipping cost is " + shippingCost);
        } else {
            shippingCost = itemPrice * 0.02;
            totalPrice = shippingCost + itemPrice;
            System.out.println("The total cost of your item including shipping is " + totalPrice + " and your shipping cost is " + shippingCost);
        }
    }
}
