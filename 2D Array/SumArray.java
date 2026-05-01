
public class SumArray {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int sum=0;
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[i].length-1; j++){
                int value=arr[i][j];
                sum=sum+value;
            }
        }
        System.out.println(sum);
    }
}
