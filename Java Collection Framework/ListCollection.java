import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.get(0));;;;;
        

        list.set(1, 15);
        System.out.println(list);
    }
}
