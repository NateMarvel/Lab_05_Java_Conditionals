import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        //num age
        //output “what is your age in years?”
        //input age
        //if age >= 21 then
        //output “Here is your wristband”
        Scanner in = new Scanner(System.in);
        int age = 0;
        System.out.print("Please enter your age in years ");
        if (in.hasNextInt()){
            age = in.nextInt();
            in.nextLine();
        } else {
            System.out.print("Please enter your age as a valid number");
        }
        if (age >= 21) {
            System.out.println("Here is your wristband");
        }
    }
}
