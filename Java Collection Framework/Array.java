import java.util.*;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(50);
        arr.add(3, 40);
        System.out.println(arr);

        arr.remove(4);
        // System.out.println(arr);


        List<Integer> arr2 =new ArrayList<>();
        arr2.add(100);
        arr2.add(110);
        arr2.add(120);
        System.out.println(arr2);
        System.out.println(arr2.size());

        arr.addAll(arr2);
        System.out.println(arr);
        System.out.println(arr.size());
        arr.removeAll(arr2);
        System.out.println(arr);
        System.out.println(arr.size());
    }
}
