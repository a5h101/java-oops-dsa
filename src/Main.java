import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {

    static boolean searchInStrings(String str,char ch){
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static  int search(int[] arr,int n){
        int idx=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                idx=i;
                break;
            }
        }
        return  idx;
    }

    static int search(ArrayList<Integer> original_list, int n) {
        ArrayList<Integer> list = new ArrayList<>(original_list);
        System.out.println(list);

        int idx = -1;
        int l = list.size();
        int st = 0;
        int end = l - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (list.get(mid) == n) {
                idx = mid;
                break;
            } else if (list.get(mid) > n) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return idx;
    }

    static int[] reverseArr(int[] arr){
        int n = arr.length;
        int index=0;
        int[] temp=new int[n];
        for (int i=n-1;i>=0;i--){
            temp[index]=arr[i];
            index++;
        }
        return temp;
    }

    static int largest(ArrayList<Integer> list){
        int n= list.get(0);
        for (Integer li_el : list) {
            if (li_el > n)
                n = li_el;
        }
        return n;
    }

    static ArrayList<Integer> sortList(ArrayList<Integer> list){
        for (Integer li_el:list){
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>list.get(i+1)){
                    int temp=list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,temp);
                }
            }
        }

        return list;
    }

    static ArrayList<Integer> reverseList(ArrayList<Integer> list){
//        ArrayList<Integer> temp_list = new ArrayList<>(list);
//        Collections.reverse(list);

        int left=0;
        int right=list.size()-1;

        while (left<right){
            int temp= list.get(left);
            list.set(left, list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        return list;
    }

    static void counter(){
        for(int i=1;i<=1000000000;i++)
            System.out.println(i);
    }

    static void arr_list(){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> test_list = new ArrayList<Integer>(10);
//        int[] a = new int[3];
        int[] a = {1,2,3};

        System.out.println("input :");
        for (int i=0;i<3;i++) {
            a[i]= sc.nextInt();
        }

        for(int n:a){
            System.out.println(n);
            test_list.add(n);
        }


        System.out.println(test_list);

        test_list.add(69);
        test_list.add(68);
        test_list.add(67);

        System.out.println(test_list);

    }

    static void arr(){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[] arr = {1,2,3,4,5};
//        for(int a: arr){
//            System.out.println(a);
//        }

//        System.out.println("enter n");
//        int n=sc.nextInt();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int[] el:matrix){
            System.out.println(Arrays.toString(el));
        }
    }

    public static void main(String[] args) {
//       arr();
//       arr_list();
//        counter();
//        int[] a = {1,2,3,4,5};
//        System.out.println(Arrays.toString(reverseArr(a)));
//        ArrayList<Integer> my_list=new ArrayList<Integer>(List.of(1,2,3,4,5));
//        int[] arr= {1,2,3,4,5};
//        System.out.println(search(arr,6));
        System.out.println(searchInStrings("Akash Singh",'A'));

    }
}