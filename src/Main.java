import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int a;
    Main(){
        a=0;
    }

    //Ceiling of a given number in an array #2
    static int binarySortCeil(int[] arr, int target){
        int st=0;
        int end=arr.length-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if(arr[mid]>target)
                end=mid-1;
             else
                st=mid+1;
        }
        if(st<arr.length)
        return arr[st];
        else return -1;
    }

    //Ceiling of a given number in an array #1
    static int getCeiling(int[] arr, int tar){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr){
            if(i==tar){
                return i;
            }
            if(i>tar){
                list.add(i);
            }
        }

        list=sortList(list);
        return list.get(0);
    }

    //Count number of digits
    static boolean isHavingEvenDigits(int num){
        int c=0;
        for (int i=num;i>0;i/=10)
            c++;
        return c%2==0;
    }

    //Count even digit els in array
    static int evenDigitEl(int []arr){
        int ed_el=0;
        for(int i:arr){
            if(isHavingEvenDigits(i))
                ed_el++;
        }
        return ed_el;
    }

    //Largest el in list
    static int maxInList(ArrayList<Integer> list){
        int max = list.get(0);
        for (int n:list) {
            if(n>max)
                max=n;
        }
        return max;
    }

    //Largest el in list #2
    static int largest(ArrayList<Integer> list){
        int n= list.get(0);
        for (Integer li_el : list) {
            if (li_el > n)
                n = li_el;
        }
        return n;
    }

    //Search char in string
    static boolean searchInStrings(String str,char ch){
        System.out.println(a);
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    //Search and return index of el in array
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

    //Search and return index of el in list
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
    //Reverse Array
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

    //Sort list in Ascending
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

    //Reverse List
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

    //count till a billion
    static void counter(){
        for(int i=1;i<=1000000000;i++)
            System.out.println(i);
    }

    //Create a list
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

    //Create 2d array
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
//        int[] arr= {1,3,5,7,50,51,52};
        int[] arr= {'a','b','d','e'};
        Scanner sc = new Scanner(System.in);
//        char ch = sc.ne();

        ArrayList<Integer> my_list=new ArrayList<Integer>(List.of(1,2,3,4,5));
//        System.out.println(Arrays.toString(reverseArr(a)));
//        System.out.println(maxInList(my_list));
//        System.out.println(search(arr,6));
//        System.out.println(searchInStrings("Akash Singh",'A'));
//        System.out.println(evenDigitEl(arr));
        System.out.println((char)(binarySortCeil(arr,'a')));

    }
}