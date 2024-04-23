package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class largestsubarray {
    static int arrSum(int[] arr) {
        int sum=0;
        for(int i:arr)
            sum+=i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];

        for(int i=0;i<len;i++)
            arr[i]=sc.nextInt();
        int max=arr[0];

        for(int i=0;i<len;i++){
            for(int j=0;j<len-i;j++){
                for(int k=j;k<=i+j;k++){
                    int[] arr2=Arrays.copyOfRange(arr,j,k+1);
                    int sum=arrSum(arr2);
                    if(sum>max){
                        max=sum;
                    }
                }
            }
        }
        System.out.println(max);

    }
}




