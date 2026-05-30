import java.util.Scanner;

public class Palindrome {

    static int PalindromeNumber(int nums){
        int revNumber=0;
        while(nums != 0){
            int digit=nums%10;
            revNumber=revNumber*10+digit;
            nums=nums/10;
        }
        return revNumber;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int originalNum=sc.nextInt();
        int ReverseNumber=PalindromeNumber(originalNum);
        if(originalNum==ReverseNumber){
            System.out.println("Palindrome Number");
        } else{
            System.out.println("Not Palindrome Number");
        }
        sc.close();
    }
}
