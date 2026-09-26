import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        //num birthMonth
        //output “What is your birth month as a number?”
        //input birthMonth
        //if birthMonth >= 1 and birthMonth <= 12 then
        //output “Your birth month is:” + birthMonth
        //else
        //output "You entered an incorrect month value:” + birthMonth
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        System.out.print("What is your birth month as a number? ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();
        } else {
            System.out.print("Please enter your birth month as a number between 1 and 12");
        }
        if (birthMonth >= 1 && birthMonth <= 12){
            System.out.println("Your birth month is " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}