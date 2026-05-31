import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println("Before adding first " + ll);

        ll.addFirst(5);
        System.out.println("after adding first "+ll);

       ll.addLast(35);
       System.out.println(ll);
    }
}
