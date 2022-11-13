class Solution {
    public void rotate(int[] nums, int k) {
        int start=0; int end=nums.length-1;
        //reverse fun
       k%=nums.length;
        reverse (nums, start,  end);
     
        reverse(nums, start,k-1);
        reverse(nums, k,end);
        
      
    }
    public void reverse(int[] nums, int s, int e){
      while(s<=e && nums.length >1 ){
       int temp=nums[s];
       nums[s]=nums[e];
       nums[e]=temp;
       s++;e--;
      }
    }
}
