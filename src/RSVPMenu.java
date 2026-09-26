import java.util.Scanner;

public class RSVPMenu
{
    public static void main(String[] args) {
        //String mealOption
        //output “Would you like chicken, fish or vegetarian. Enter C F or V”
        //input mealOption
        //if mealOption == “C” then
        //output “You get the Chicken Parmesan!”
        //else if mealOption == “F” then
        //output "You get the Roast Salmon!”
        //else if mealOption == “V” then
        //output "You get the Butternut Squash!”
        //else
        //output "you entered something not on the menu:” + mealOption
        Scanner in = new Scanner(System.in);
        String mealOption;
        System.out.print("Would you like chicken, fish or vegetarian. Enter C F or V ");
        mealOption = in.nextLine();
        if (mealOption .equals("C")) {
            System.out.println("You get the Chicken Parmesan!");
        } else if (mealOption .equals("F")) {
            System.out.println("You get the Roast Salmon!");
        } else if (mealOption .equals("V")) {
            System.out.println("You get the Butternut Squash!");
        } else {
            System.out.println("You entered something not on the menu: " + mealOption);
        }
    }
}
