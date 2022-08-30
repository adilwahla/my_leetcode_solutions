//https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
  public   int search(int[] nums, int target) {
       int pivot= findPivot(nums);
        if(pivot==-1){
         // that means array is not sorted circular array
         // do normal Binary Search
       return binarySearch(nums,target,0,nums.length-1);
        }
        else{
            //if pivot is found i have 2 asc sorted array
            if(target==nums[pivot]){
                //search in right
                return  pivot;
            }
             if(target>=nums[0]){
                //search in left
                return  binarySearch(nums, target,0,pivot-1);
            }
      
          
                return  binarySearch(nums, target,pivot+1,nums.length-1);
            
        //   
        }
    }

    public  int binarySearch(int[] arr, int target,int start,int end) {
        //stat,mid,end are main points of BS Algo
 
       
        while(start<=end){
            int mid= start + (end-start)/2;// int may go out of bound                   
            if(target>arr[mid]){
                // move right 
                start=mid+1;
            }
            if(target<arr[mid]){
                // move left
                end=mid-1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
    //pivot fun
    public  int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //finding  pivot (peak) element 
            //4-cases
            // case-1
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //case-2
            if(mid> start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // case-3
         if(arr[mid]<= arr[start]){
            end =mid-1;
         } // case-4
         else{
            start=mid+1;
         }
         
        }
        
        return -1;
    }
}
