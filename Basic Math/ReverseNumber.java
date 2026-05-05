import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int nums=sc.nextInt();
        int revNumber=0;
        while(nums != 0){
            int digit=nums%10;
            revNumber=revNumber*10+digit;
            nums=nums/10;
        }
        System.out.println(revNumber);
        sc.close();
    }
}
