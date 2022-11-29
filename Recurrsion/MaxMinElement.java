package Recursion;



public class MaxMinElement {
    public static void main(String[] args) {
      int[]  arr = {1, 4, 3, -5, -4, 8, 6};
     // int[] ans={0,0};
     int ans=  min(arr,arr.length);
   System.out.println(ans);
   int max=  max(arr,arr.length);
   System.out.println(max);
    }
    private static int max(int[] arr, int n) {
        //base Condition
     if(n==1){
        return arr[0];
     }
        return Math.max(arr[n-1],max(arr,n-1) );
    }
    private static int min(int[] arr, int n) {
        //base Condition
     if(n==1){
        return arr[0];
     }
        return Math.min(arr[n-1],min(arr,n-1) );
    }

    // private static int[] minMax(int[] arr,int index, int min,int max) {
      
      
    //    //base condition
    //    if(index==arr.length){
    //      return new int[]{min,max};
    //    }
  
    //    if(arr[index]>max){
    //     max=arr[index];
      
    //    }
    //    if(arr[index]<min){
    //     min=arr[index];

    //    }
    //   int newIndex=index+1;
    //  return  minMax(arr,newIndex,min,max);
    // }
   
}
