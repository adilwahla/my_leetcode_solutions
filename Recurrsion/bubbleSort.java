package Recursion;

import java.util.Arrays;

public class bubbleSort {
     public static void main(String[] args) {
      //  int [] arr={5,4,3,2,1};
       int [] arr={3,1,5,4,2};
        bubblesort(arr,1,arr.length-1);
        System.out.println(Arrays.toString(arr));
     }
     public static int[] bubblesort(int[] arr,int start,int end){
        // int [] arr={3,1,5,4,2};
        int s=start;int e=end;
       //base condition
       if(e==0){
        return arr;
       }
       //swap
       if(arr[s-1]>arr[s]){
                    //swap
                    int temp=arr[s];
                    arr[s]=arr[s-1];
                    arr[s-1]=temp;    
                }
                s+=1;
        if(s==arr.length){
            e-=1;
            return bubblesort(arr, 1, e);
        }        
       
return bubblesort(arr, s,e );
  }
}
