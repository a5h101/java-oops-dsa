package recursion;//public class recursion.recursion.mergeSort {
//    static void merge(int[] arr, int l, int m, int r){
//        int n1 = m-l+1;
//        int n2 = r-m;
//        int[] left = new int[n1];
//        int[] right = new int[n2];
//        for(int i=0;i<n1;i++)
//            left[i] = arr[l+i];
//        for(int i=0;i<n2;i++)
//            right[i] = arr[m+1+i];
//        int i=0,j=0,k=l;
//        while (i<n1 && j<n2){
//            if(left[i]<=right[j]){
//                arr[k] = left[i];
//                i++;
//            }
//            else {
//                arr[k] = right[j];
//                j++;
//            }
//            k++;
//        }
//        while (i<n1){
//            arr[k] = left[i];
//            i++;
//            k++;
//        }
//        while (j<n2){
//            arr[k] = right[j];
//            j++;
//            k++;
//        }
//    }
//static int[] merge(int[] arr,int l,int r){
//        if(l<r){
//            int m = (l+r)/2;
//            merge(arr,l,m);
//            merge(arr,m+1,r);
//            merge(arr,l,m,r);
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        int[] arr = {5,4,3,2,1};
//        int[] sorted = merge(arr,0,arr.length-1);
//        for(int i:sorted)
//            System.out.print(i+" ");
//    }
//}


public class mergeSort {
    static void mergeSort(int[] arr, int l, int r) {
    if(l>=r) return;
    int mid = (l+r)/2;
    mergeSort(arr, l, mid);
    mergeSort(arr, mid+1, r);
    merge(arr,l,mid,r);
    }

    static int[] merge(int[] arr, int l,int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0;i<n1;i++)
            left[i] = arr[l+i];
        for(int i=0;i<n2;i++)
            right[i] = arr[mid+1+i];
        int i=0,j=0,k=l;
        while (i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;
        System.out.print("Array before sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        mergeSort(arr,0,n-1);

        System.out.print("Array after sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}