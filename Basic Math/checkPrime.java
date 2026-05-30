import java.util.Scanner;

public class checkPrime {

    static boolean isPrime(int nums){
        for(int i=2; i<=nums-1; i++){
            if(nums%i==0){
                return false;
            }
        }
        return true;
    }

    static boolean isPeimes(int nums){
        for(int i=2; i*i<=nums; i++){
            if(nums*i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int nums=sc.nextInt();
        System.out.println(isPrime(nums));
        sc.close();
    }
}
