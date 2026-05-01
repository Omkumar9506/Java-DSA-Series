import java.util.Scanner;

public class input2DAray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[2][4];
        
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[i].length-1; j++){
                // System.out.println("row value "+ i + "col value "+ j);
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[i].length-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
