import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 4;
        int[] arr ={-2,-5,-4,-3};

//        for(int i=0;i<n;i++)
//            arr[i]=sc.nextInt();
        // Initialize arr[] with input values

        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.print(maxSum);
    }
}
