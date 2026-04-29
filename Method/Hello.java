package Method;

public class Hello {
    static void printName(){
        System.out.println("Hariom Kumar Gupta");
    }

    static void twoSum(){
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);
    }


    static void threeSum(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
    }


    static int add(){
        int a = 2;
        int b = 3;
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {   
        printName();
        twoSum();
        threeSum(10, 20, 30);
        int result = add();
        System.out.println(result);
    }
}
