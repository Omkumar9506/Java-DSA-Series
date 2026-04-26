package Loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i==10){
                break;
            }
            System.out.println(i);
        }

        sc.close();
    }
}
