// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        // Set<Integer> st = new HashSet<>();
        // st.add(10);
        // st.add(20);
        // st.add(30);
        // st.add(10);
        // st.add(30);
        // System.out.println(st);


        Set<Integer> st = new LinkedHashSet<>();
        st.add(100);
        st.add(200);
        st.add(300);
        st.add(400);
        System.out.println(st);
    }
}
