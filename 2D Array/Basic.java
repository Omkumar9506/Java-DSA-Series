
public class Basic {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        
        // Acces Individual value
        System.out.println(arr[1][1]);

        int row=arr.length;
        int col=arr[0].length;

        // Access all array value
        for(int i=0; i<=row-1; i++){
            for(int j=0; j<=col-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }   
}
