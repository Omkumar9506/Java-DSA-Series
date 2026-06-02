

public class CountZeroOne {

    static int[] oneZeroCount(int arr[]){
        int zero=0;
        int one=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                one=one+1;
            } else{
                zero=zero+1;
            }
        }
        int ans[]={one, zero};
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,0,1,1,0};
        int ans[]=oneZeroCount(arr);
        System.out.println("One: "+ans[0]);
        System.out.println("zero: "+ans[1]);
        
    }
}
