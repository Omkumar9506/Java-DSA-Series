import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(6);
        arr.add(1);
        Collections.sort(arr);
        System.out.println(arr);
    }    
}
