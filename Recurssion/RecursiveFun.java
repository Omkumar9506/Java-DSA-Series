package Recurssion;

import java.util.Scanner;

public class RecursiveFun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter Number: ");
        // int num=sc.nextInt();
        // numPrint(num, 1);
        // printName(10);
        // nto1(num);
        int[] arr = {10,20,30,40,50,60,10,10,20,10};
        // printArray(arr, 0);
        int i=0;
        // int maxi=Integer.MIN_VALUE;
        // findMaximum(arr, i, maxi);
        // int mini = Integer.MAX_VALUE;
        // findMinimum(arr, i, mini);

        // int target=10;
        // int count=0;
        // countEle(arr, i, target, count);

        printDigit(137);
        
    }

    public static void printDigit(int num){
        if(num==0){
            return ;
        }
        int digit=num%10;
        num=num/10;
        printDigit(num);
        System.out.println(digit);
    }

    public static void countEle(int[] arr, int i, int target, int count){
        if(i>=arr.length){
            System.out.println("Total count is: " + count);
            return;
        }
        if(arr[i]==target){
            
            count++;
        }
        countEle(arr, i+1, target, count);
    }

    public static int findTarget(int arr[], int i, int target){
        if(i>arr.length){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }

        return  findTarget(arr, i+1, target);
    }

    public static void findMinimum(int[] nums, int i, int mini){
        if(i>=nums.length){
            System.out.println("min value is : "+mini);
            return ;
        }
        if(nums[i]<mini){
            mini=nums[i];
        }
        findMinimum(nums, i+1, mini);
    }

    public static void findMaximum(int[] nums, int i, int maxi){
        if(i>=nums.length){
            System.out.println("max value is : "+maxi);
            return ;
        }
        if(nums[i]>maxi){
            maxi=nums[i];
        }
        findMaximum(nums, i+1, maxi);
    }

    public static void printName(int n){
        if (n==0) {
            return ;
        }
        System.out.println("Hariom");
        printName(n-1);
    }

    public static void numPrint(int n, int count){
        if(count>n){
            return;
        }
        System.out.println(count);
        numPrint(n, count+1);
    }

    public static void nto1(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        nto1(n-1);
    }

    public static void printArray(int[] arr, int i){
        if(i>=arr.length){
            return ;
        }

        System.out.println(arr[i]);
        printArray(arr, i+1);
    }
}
