import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ");
        int nums=sc.nextInt();

        int sum=0;
        while(nums!=0){
            int digit=nums%10;
            sum=sum+digit;
            nums=nums/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
