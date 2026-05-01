import java.util.Scanner;

public class ArrayAddition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int nums = sc.nextInt();

        int arr[] = new int[nums];

        for(int i=0; i<=nums-1; i++){
            System.out.println("Enter Index value of "+i);
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<=arr.length-1; i++){
            int value = arr[i];
            sum = sum+value;
        }
        System.out.println("Total sum is "+sum);
        sc.close();
    }
}