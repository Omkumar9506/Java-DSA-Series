

public class MaximumElement {

    static int findMax(int arr[]){
        int maxi = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 9, 2, 4, 6};
        System.out.println(findMax(arr));
        
    }
}
