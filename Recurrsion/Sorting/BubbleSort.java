package Recursion.Lecture4Recurrsion;

import java.util.Arrays;
// with recurrsion
public class BubbleSort {
     public static void main(String[] args) {
          int [] arr={3,1,5,4,2};
          bubbleSort(arr,arr.length-1,0);
          System.out.println(Arrays.toString(arr));
     }
     public static void bubbleSort(int[] arr,int r,int c){
        if(r<=0){
            return;
        }
        if(c<r){
           // swap
           if(arr[c]>arr[c+1]){
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
           }
           bubbleSort(arr, r, c+1);
        }
        else{
            bubbleSort(arr, r-1, 0);
        }
  
          
     }
     //LINEAR METHOD 
     public static void bubbleSort1(int[] arr){
        boolean swapped; //take a flag to check swapped
        //outer loop ensures each time last element gets at right position
        for (int i = 0; i < arr.length; i++) {
             // int [] arr={3,1,5,4,2};
            swapped=false;
            //inner loop swaps element if required 
            for (int j = 1; j < arr.length-i; j++) {
                //swap if previous element is greater than next
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
               
            }
            if(!swapped){
                break;
            }
        }
     }
}
