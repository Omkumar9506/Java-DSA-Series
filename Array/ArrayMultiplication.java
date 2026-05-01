import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums=sc.nextInt();
        int arr[] = new int[nums];

        for(int i=0; i<nums; i++){
            System.out.println("Enter index value of "+i);
            arr[i]=sc.nextInt();
        }
        int total = 1;
        for(int i=0; i<=arr.length-1; i++){
            int value = arr[i];
            total =total*value;   
        }
        System.out.println("Total multiplication is "+total);

        sc.close();
    }
}
