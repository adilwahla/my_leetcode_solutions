class Solution {
       public   int[] twoSum(int[] nums, int target) {
           int[] nums2=Arrays.copyOf(nums, nums.length);
           Arrays.sort(nums2);
           //find two sum as binary
          int[] numbers= binarySearch(nums2,target);
          int a =numbers[0]; int b=numbers[1];
          int[] ans=new int[2];
          for (int i = 0; i < nums.length; i++) {
            if(a==nums[i]){
             ans[0]=i; break;
            }
          }
          if(a!=b){
            for (int i = 0; i < nums.length; i++) {
                if(b==nums[i]){
                    ans[1]=i; break;
                   }
            }
          }
          else {
           for (int i = 0; i < nums.length; i++) {
            if(b==nums[i] && i !=ans[0]){
                ans[1]=i;
            }
           }
          }
           return ans;
    }
    public  int[] binarySearch(int[] arr, int target) {
        //stat,mid,end are main points of BS Algo
        int start=0;
        int end=arr.length-1;
       int a=0; int b=0;
        while(start<end){
            int sum= arr[start]+arr[end];// int may go out of bound                   
            if(sum<target){
                // move right 
                start++;
            }
           else if(sum>target){
                // move left
                end--;
            }
            else {
               a=arr[start];b=arr[end];
             return new int[]{a,b};
            }
        }

        return new int[]{0,0};
    }
}
