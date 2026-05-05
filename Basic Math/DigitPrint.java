import java.util.Scanner;

public class DigitPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int nums=sc.nextInt();
        while(nums != 0){
            int digit=nums%10;
            System.out.println(digit);
            nums=nums/10;
        }
        sc.close();
    }
}
