public class recursion {
    static int fib(int n){
        if(n==0 || n==1)
            return n;
        return  fib(n-1)+fib(n-2);
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

    static int sumOddArr(int i,int[] arr){
        if(i==0)
            return arr[0];
        int sum = sumOddArr(i-1,arr);
        if(arr[i]%2==1)
            sum+=arr[i];

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(fibonaccci(45));
        System.out.println(fib(45));

//        System.out.println(fact(3));
//        System.out.println(factR(3));
//
//        int[] a={5,3,2,5,10,5};
//        System.out.println(sumArr(a.length-1,a));
//        System.out.println(countOccurence(a.length-1,a,5));
//        System.out.println(sumOddArr(a.length-1,a));
    }
}




