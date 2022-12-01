package Recursion;

import java.util.Arrays;

public class SelectionSortRecursion {
     public static void main(String[] args) {
         //  int [] arr={5,4,3,2,1};
    //    int [] arr={3,1,5,4,2};
    //    bubblesortRecursive(arr,1,arr.length-1);
    //    System.out.println(Arrays.toString(arr));
    int[] arr={1,2,-772,0,100};
    selectionRecurrsion(arr,0,arr.length);
    System.out.println(Arrays.toString(arr));
     }
     private static void selectionRecurrsion(int[] arr, int start,int end) {
          // find index of minmum number in array
          if(start==end){
            return; 
          }

          int minIndex=findMinIndex(arr,start,end-1);
          // swap if  needed
          if(minIndex!=start){
                //swap
                int temp=arr[minIndex];
                arr[minIndex]=arr[start];
                arr[start]=temp;
          }
         selectionRecurrsion(arr,start+1,end);
    }
    private static int findMinIndex(int[] arr, int start,int end) {
        {
            if (start == end)
                return start;
          
            // Find minimum of remaining elements
            int k = findMinIndex(arr, start + 1, end);
          
            // Return minimum of current and remaining.
            return (arr[start] < arr[k])? start : k;
        }
          
            }  
      
          
           
    
    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i; j < arr.length; j++) {
              if(arr[j]<arr[min]){
                min=j;
              }  
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }}

    //  private static int[] bubblesortRecursive(int[] arr, int start,int end) {
    //          // two loops 
    //          int s=start;int e=end;
    //          if (e==0){
    //             return arr;
    //          }
    //         //swap
    //         if(arr[s-1]>arr[s]){
    //             int temp=arr[s-1];
    //             arr[s-1]=arr[s];
    //             arr[s]=temp;
    //         }
    //         s++;
    //         if(s==arr.length){
    //             e--;
    //             return bubblesortRecursive(arr, 1, e);
    //         }
    //         return bubblesortRecursive(arr, s, e);
      
      
       
     
    // }


    // private static void bubblesort(int[] arr) {
    //     boolean swapped;
    //  for (int i = 0; i < arr.length; i++) {
    //     swapped=false;
    //     for (int j = 1; j < arr.length-i; j++) {
    //         //swap
    //         if(arr[j-1]>arr[j]){
    //             int temp=arr[j-1];
    //             arr[j-1]=arr[j];
    //             arr[j]=temp;
    //             swapped=true;
    //         }
        
    //     }
    //     if(!swapped){
    //         break;
    //     }
    //  }
    // }

