package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,10,77,90};
        int ans=search(arr,90,0,arr.length-1);
        System.out.println(ans);
    }

    private static int search(int[] arr, int target, int s, int e) {
        int m=s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(target==arr[m]){
            return m;
        }
        if(target>arr[m]){
         return  search(arr, target, m+1, e);
        }
        return   search(arr, target, s, m-1);
   

    }


}
