public class MaxArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 2, 5, 71, 9};
        int maxValue = arr[0];

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        System.out.println(maxValue);
    }
}
