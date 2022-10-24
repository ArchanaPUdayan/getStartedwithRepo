import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value:");
        int a=sc.nextInt();
        System.out.println("Enter the second value:");
        int b=sc.nextInt();
        System.out.println("Perfect Numbers between "+a+ " and "+b);
        for (int i = a; i <= b; i++) {
            int number = i;
            int sqrt = (int) Math.sqrt(number);
            if (sqrt * sqrt == number) {
                System.out.println(number);
            }
        }
    }
}



