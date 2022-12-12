package Recursion.LECTURE3arrays;

import java.util.ArrayList;

public class LinearSearch {
     public static void main(String[] args) {
        int[] arr={3,2,1,5,5,18,9};
        int target=5;
        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
        System.out.println(findIndexLast(arr,target,arr.length-1));
        // findAllIndex(arr,target,0);
        // System.out.println(list);
       ArrayList<Integer> ans= findAllIndexArrayList(arr,target,0,new ArrayList<>());
        System.out.println(ans);
        //
       System.out.println( findAllIndex2(arr,5,0));
     }

    private static boolean find(int[] arr, int target, int index) {
        if(index==arr.length){
            // return Integer.MAX_VALUE;
            return false;
        }
        // return (arr[index]==target)?index:find(arr,target,index + 1);
        return (arr[index]==target)||find(arr,target,index + 1);
    }
    private static int findIndex(int[] arr, int target, int index) {
        if(index==arr.length){
            return -1;
          
        }
        return (arr[index]==target)?index:findIndex(arr,target,index + 1);
       
    }
    private static int findIndexLast(int[] arr, int target, int index) {
        if(index==-1){
            return -1;
          
        }
        return (arr[index]==target)?index:findIndexLast(arr,target,index - 1);
       
    }
    /*
     * FIND ALL OCCURENCES IN LINEAR SEARCH 
     */
     static ArrayList<Integer> list=new ArrayList<>();
  public static    void findAllIndex(int[] arr, int target, int index) {
        if(index==arr.length){
            return ;
          
        }
        if(arr[index]==target){
            list.add(index);
        }
      findAllIndex(arr,target,index + 1);
       
    }
    /*
     * FIND ALL OCCURENCES IN LINEAR SEARCH Return ArrayList
     */
    
  public static   ArrayList<Integer> findAllIndexArrayList(int[] arr, int target, int index,ArrayList<Integer> list) {
        if(index==arr.length){
            return list;
          
        }
        if(arr[index]==target){
            list.add(index);
        }
     return findAllIndexArrayList(arr,target,index + 1,list);
       
    }
    /*
     * Q#5: Return the array list without taking arrayList in  argument?  
     */
    public static   ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
       ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list; 
        }
        /* THIS WILL BE ONLY FOR SINGLE FUNCTION call only */
        if(arr[index]==target){
            list.add(index);
        }
     ArrayList<Integer> answersFromBelowCalls= findAllIndex2(arr,target,index + 1);
     list.addAll(answersFromBelowCalls);
     /*
     list.add() will not work list.addAll() works bcz collection of items will come 
     */
     return list;
       
    }
}
