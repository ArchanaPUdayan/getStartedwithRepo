import java.util.Scanner;

public class celsius {
    public static void main(String[] args){
        double C ,f;
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the fahrenheit Temperature:");
C=sc.nextFloat();
        System.out.println("Enter the celsius Temperature:"+celsius(C));
    }
    static double celsius(double f)
    {
        return (f-32)*5/9;
    }
}
