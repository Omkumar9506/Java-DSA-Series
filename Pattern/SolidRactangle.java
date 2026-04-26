package Pattern;
import java.util.Scanner;

public class SolidRactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        for(int i=1; i<=n-2; i++){
            for(int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
