import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number ");
        int nums=sc.nextInt();

        int count=0;
        while(nums!=0){
            int digit=nums%10;
            count++;
            nums=nums/10;
        }
        System.out.println(count);
        sc.close();
    }
}
