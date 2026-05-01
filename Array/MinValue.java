public class MinValue {
    public static void main(String[] args) {
        int arr[] = {10, 2, 1, 5, -7};
        int minValue = arr[0];

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]<minValue){
                minValue=arr[i];
            }
        }
        System.out.println(minValue);
    }
}
