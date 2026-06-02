

public class PosNegNumber {

    static int[] negPosNum(int arr[]){
        int positive = 0;
        int negative=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                positive = positive+arr[i];
            } else{
                negative=negative+arr[i];
            }
        }
        int ans[] = {positive, negative};
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,5,7,8,9,-4,-8,8,-3};
        int ans[]=negPosNum(arr);
        System.out.println("Positive: "+ans[0]);
        System.out.println("Negative: "+ans[1]);
        
    }
}
