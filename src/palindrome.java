import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int Number, Temp, Reminder, Reverse = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter any number to Check : ");
        Number = sc.nextInt();

        Temp = Number;
        while(Temp > 0) {
            Reminder = Temp %10;
            Reverse = Reverse * 10 + Reminder;
            Temp = Temp /10;
        }
        System.out.println("Reverse of entered number is = "+ Reverse);
        if(Number == Reverse) {
            System.out.println("is Palindrome Number."+ Number);
        }
        else  {
            System.out.println("is Not a palindrome Number."+ Number);
        }
    }
}


