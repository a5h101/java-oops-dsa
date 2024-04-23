package problems;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class probSolve {
    static void pattern(int n) {
        int sp = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            if (i <= n / 2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }
    }
    static int len(int n){
        int c=0;
        for(int i=n;i>0;i/=10)
            c++;
        return c;
    }

    static boolean checkEven(int n){
        return n % 2 == 0;
    }

    static int[] makeArr(int n,int len){
        int[] arr = new int[len];
        int j=len-1;
        for(int i=n;i>0;i/=10){
            arr[j]=i%10;
            j--;
        }
        return arr;
    }
    static int reverse(int n){
        int n1=0;
        int c=1;
        for(int i=n;i>0;i/=10){
            int d=i%10;
            n1*=c;
            n1+=d;
            c*=10;
        }
        return n1;
    }
    static String generateRollNo(int id){
        StringBuilder roll_no= new StringBuilder();
        String roll_no_end="";
        int id_len=len(id);

        if(!checkEven(id_len)){
            roll_no_end+=id%10;
            System.out.println(roll_no_end);
            id/=10;
            id_len--;
        }
        System.out.println(roll_no_end);
        int[] arr = new int[id_len];
        int j=id_len-1;
        for(int i=id;i>0;i/=10){
            arr[j]=i%10;
            j--;
        }

        int[] arr2=new int[(arr.length/2)];

        int k=0;
        for(int i=0;i<arr.length-1;i+=2){
            arr2[k] = Math.max(arr[i], arr[i + 1]);
            k++;
        }

        for (int el : arr2) {
            roll_no.append(el);
        }

        roll_no.append(roll_no_end);
        return roll_no.toString();
    }
    /*---------------------

      *
     ***
    *****
     ***
      *

     ---------------------*/



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hi");
        int id = sc.nextInt();
        System.out.println(generateRollNo(id));
        pattern(5);
    }
}
/*
* 45 68 54 3
* */