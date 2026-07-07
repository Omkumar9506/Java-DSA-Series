import java.util.HashMap;

public class Mode {

    static int getMode(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        // for(int i: freq.keySet()){
        //     System.out.println(i+"->"+freq.get(i));
        // }

        int maxFreq=-1;
        int maxKey=-1;

        for(int key: freq.keySet()){
            int currentFreq=key;
            int currentKey=freq.get(key);
            if(currentFreq>maxFreq){
                maxFreq=currentFreq;
                maxKey=currentKey;
            }
        }
        return maxKey;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,6,2,1,3,2,5,2,3,6,1,2,3};
        int ans=getMode(arr);
        System.out.println(ans);
        
    }
}
