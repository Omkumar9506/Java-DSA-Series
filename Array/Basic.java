

public class Basic {
    public static void main(String[] args) {
        System.out.println("Array Creation");
        arrayCreation();

        System.out.println("Array creation with new keyword");
        arrayCreationWithNew();

    }

    static void arrayCreation(){
        int arr[] = {10, 20, 30, 40};

        // Access Individual value
        System.out.println(arr[0]);

        // Access all array value
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void arrayCreationWithNew(){
        int []arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        // Acces individual value
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        // Access all array value
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
