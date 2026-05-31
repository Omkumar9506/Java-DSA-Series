import java.util.ArrayList;
import java.util.List;

public class toArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Print ArrayList: " + list);

        Object[] arr = list.toArray();
        for(Object obj: arr){
            System.out.println(obj);
        }

        System.out.println(list.contains(20));
    }
}
