// import java.util.*;;
public class Avg {

    static double getAvg(int[] arr){
        double sum=0;
        for(int i=0; i<=arr.length; i++){
            sum=sum+i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }

    // Multiply each element of array by 10
    static int[] multiplyBy10(int[] arr){
        int size=arr.length;
        int newArray[]=new int[size];

        for(int i=0; i<arr.length; i++){
            int element=arr[i];
            int newElement=element*10;
            newArray[i]=newElement;
        }
        return newArray;
    }

    // Search for an element in an array {Linear Search}
    static boolean searchElement(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    

    public static void main(String[] args){
        int arr[]={2, 4, 6, 8};
        boolean ans=searchElement(arr, 8);
        System.out.println(ans);


        // int ans[]=multiplyBy10(arr);
        // for(int i: ans){
        //     System.out.println(i);
        // }


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Number : ");
        // int n = sc.nextInt();
        // System.out.print("Enter Element: ");
        // int arr[] = new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(multiplyBy10(arr));
        // }


        // System.out.println(getAvg(arr));
        // System.out.println(multiplyBy10(arr));
        // sc.close();
    }    
}
