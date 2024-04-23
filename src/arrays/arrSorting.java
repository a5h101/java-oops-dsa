package arrays;

import java.util.Arrays;

public class arrSorting {
    static int[] insertionSort(int[] arr){
        Arrays.sort(arr);

        return  arr;
    }

    static void merge(int[] left, int[] right, int[] arr){
        int i=0,j=0,k=0;
        while (i<left.length && j<right.length){
            if(left[i]<right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while (i<left.length)
            arr[k++]=left[i++];

        while (j<right.length)
            arr[k++]=right[j++];
    }
    static int[] mergeSort(int[] arr){
        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];

        for(int i =0;i<mid;i++){
            left[i]=arr[i];
        }
        for(int i=mid;i<arr.length;i++){
            right[i-mid] = arr[i];
        }

        if(arr.length<=1)
            return arr;

        mergeSort(left);
        mergeSort(right);

        merge(left,right,arr);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 2, 2, 4, 7 };
        int[] ans = mergeSort(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

}
