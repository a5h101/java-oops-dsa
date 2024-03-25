import java.util.ArrayList;
import java.util.Objects;

public class recursion {
    static int fib(int n){
        if (n==0||n==1) return n;
        return fib(n-1)+fib(n-2);
    }
    static int fibonaccci (int n){
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    static int oneToN(int n){
        if(n>10) return n;
        System.out.println(n);
        return oneToN(n+1);
    }
    static int fact(int n){
        int i=1;
        int j=1;
        while (j<=n){
            i*=j;
            j++;
        }
        return i;
    }
    static int factR(int n){
        if(n<=1) return 1;
        return n*factR(n-1);
    }
    static int sumArr(int i,int[] arr){
        if(i==0)
            return arr[0];
        return arr[i]+sumArr(i-1,arr);
    }
    static int sumOfDigs(int n){
        if(n/10<1) return n;
      return  sumOfDigs(n/10) + n%10;
    }
    static int countOccurence(int i,int[] arr,int count,int el){
        if(i==0) {
            if (arr[i] == el)
                count++;
            return count;
        }
        if(arr[i]==el)
            count++;
        return countOccurence(i-1,arr,count,el);
    }
    static int PpowQ(int p,int q){
        if(q==0) return 1;
        return PpowQ(p,q-1)*p;
    }
    static int countOccurence(int i, int[] arr, int el) {
        if (i < 0)
            return 0;

        int count = countOccurence(i - 1, arr, el);

        if (arr[i] == el)
            count++;

        return count;
    }
    static int sumOddArr(int i,int[] arr){
        if(i==0)
            return arr[0];
        int sum = sumOddArr(i-1,arr);
        if(arr[i]%2==1)
            sum+=arr[i];

        return sum;
    }
    static void  printMultiples(int n,int k){
        if(k<1) return;
        printMultiples(n,k-1);
        System.out.print(n*k+ ", ");
    }
    static int alternateSum(int n){
        if(n==1) return 1;
        if(n%2==0)
            return alternateSum(n-1)-n;
        else
            return alternateSum(n-1)+n;
    }
    static int gcd(int a,int b){
        while(b%a!=0){
            int rem = b%a;
            b = a;
            a = rem;
        }
        return a;
    }
    static int gcdR(int a,int b){
        if(b%a==0) return a;
      return gcdR(b%a,a);
    }
    static void printArr(int[] arr, int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]);
        printArr(arr,idx+1);
    }
    static int maxVal(int[] arr,int idx){
        if(idx==0) return arr[idx];
        return Math.max(maxVal(arr,idx-1),arr[idx]);
    }
    static int sumOfArr(int[] arr ,int idx){
        if(idx==arr.length-1) return arr[idx];
        return arr[idx]+sumOfArr(arr,idx+1);
    }
    static boolean arrTarget(int[] arr,int idx, int target){
        if(idx==arr.length) return false;
        if(arr[idx]==target) return true;
        return arrTarget(arr,idx+1,target);
    }
    static int arrTargetIdx(int[] arr,int idx, int target){
        if(idx==arr.length) return -1;
        if(arr[idx]==target) return idx;
        return arrTargetIdx(arr,idx+1,target);
    }
    static ArrayList<Integer> arrTargetAllIdx(int[] arr, int idx, int target, ArrayList<Integer> list){
        if(idx==arr.length) return list;
        if(arr[idx]==target) list.add(idx);
        return arrTargetAllIdx(arr,idx+1,target,list);
    }
    static boolean arrIsSorted(int[] arr, int idx){
         if(idx==arr.length-1) return true;
         if(arr[idx]>arr[idx+1]) return false;
         return arrIsSorted(arr,idx+1);
    }
    static String removeA(String str,int i){
        if(i==str.length()) return "";
        if(str.charAt(i)!='a') return str.charAt(i)+removeA(str,i+1);
        else return removeA(str,i+1);
    }
    static String removeA2(String str){
        if(str.length()==0) return "";
        if(str.charAt(0)!='a') return str.charAt(0)+removeA2(str.substring(1));
        else return removeA2(str.substring(1));
    }
    static String reverseString(String str, int idx){
        if(str.length()==idx) return "";
        return reverseString(str,idx+1)+str.charAt(idx);
    }
    static boolean isPalindrome(String str,int idx){
        int i = str.length()-1-idx;
        if(idx==i) return str.charAt(idx)==str.charAt(i);
        if(str.charAt(idx)!=str.charAt(i)) return false;
        return isPalindrome(str,idx+1);
    }
    static ArrayList<String> getSSQ (String str){
        ArrayList <String> ans = new ArrayList<>();
        if(str.length()==0) {
            ans.add("");
            return ans;
        }
        ArrayList<String> ssq = getSSQ(str.substring(1));
        for(String s:ssq){
            ans.add(s);
            ans.add(s+str.charAt(0));
        }
        return ans;
    }
    public static void main(String[] args) {
//        System.out.println(reverseString("abcde",0));
//        System.out.println(getSSQ("abc"));
//        System.out.println(isPalindrome("li",0));
//        int[] arr = {1,2,4,9,5};
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(removeA("akash",0));
//        System.out.println(removeA2("akash"));
//        System.out.println(arrTarget(arr,0,1));
//        System.out.println(arrTargetIdx(arr,0,1));
//        System.out.println(arrTargetAllIdx(arr,0,9,list));
//        System.out.println(arrIsSorted(arr,0));
//        printArr(arr,0);
//        System.out.println(sumOfArr(arr,0));
//        System.out.println(maxVal(arr,arr.length-1));
//        System.out.println(PpowQ(2,4));
//        System.out.println(printMultiples(12,3));
//        printMultiples(12,3);
//        System.out.println(alternateSum(5));
//        System.out.println(fibonaccci(45));
//        System.out.println(gcdR(15,24));
//        System.out.println(fib(2));
//        System.out.println(sumOfDigs(10));
//        System.out.println(oneToN(1));

//        System.out.println(fact(3));
//        System.out.println(factR(5));
//
//        int[] a={5,3,2,5,10,5};
//        System.out.println(sumArr(a.length-1,a));
//        System.out.println(countOccurence(a.length-1,a,5));
//        System.out.println(sumOddArr(a.length-1,a));
    }
}




