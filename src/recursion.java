public class recursion {
//    fibonacci series using recursion
    static int fib(int n){
        if(n==0 || n==1)
            return n;
        return  fib(n-1)+fib(n-2);
    }

//    static int factorial(int n){
//        if()
//        factorial(n*n+1);
//        return n;
//    }
//
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
        if(n<2){
            return 1;
        }
        return n*factR(n-1);
    }

    static int sumArr(int i,int[] arr){
        if(i==0)
            return arr[0];
        return arr[i]+sumArr(i-1,arr);
    }

//    static int countOccurence(int i,int[] arr,int count,int el){
//        if(i==0) {
//            if (arr[i] == el)
//                count++;
//            return count;
//        }
//        if(arr[i]==el)
//            count++;
//        return countOccurence(i-1,arr,count,el);
//    }

    static int countOccurence(int i, int[] arr, int el) {
        if (i < 0)
            return 0;

        int count = countOccurence(i - 1, arr, el);

        if (arr[i] == el)
            count++;

        return count;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fact(3));
        System.out.println(factR(3));

        int[] a={5,3,2,5,10,5};
        System.out.println(sumArr(a.length-1,a));

        System.out.println(countOccurence(a.length-1,a,5));
    }
}



//5 = 1*2*3*4*5

