import java.util.*;

class Pattern {
    public static void main(String[] args) {
        int i,j,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number:");
         num=sc.nextInt();

        for ( i = 1;i<= num;i++) {
            for ( j = 1;j <= i;j++) {
                System.out.print( i + " ");
            }

            System.out.println();

        }

    }

}
