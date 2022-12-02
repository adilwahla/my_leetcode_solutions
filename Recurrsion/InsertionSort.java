package Recursion;

import java.util.Arrays;

public class InsertionSort {
     public static void main(String[] args) {
      int[] arr={5,4,3,2,1};
     // int[] arr={-5,4,-3,2,100};
        insertion(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
     }

    private static int[] insertion(int[] arr,int start,int end) {
    //base condition
   if(start==end){
    return arr;
   }
        for (int j = start+1; j >0; j--) {
                //swap
                if(arr[j-1]>arr[j]){
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }      
            }
return insertion(arr,start+1,end);
        
    }
}
