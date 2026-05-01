package String;

public class Basic {
    public static void main(String[] args) {
        String firstName="Peter";
        String lastName=new String("Parkar");
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(0));

        for(int i=0; i<=firstName.length()-1; i++){
            System.out.println(firstName.charAt(i));
        }
    }
}
