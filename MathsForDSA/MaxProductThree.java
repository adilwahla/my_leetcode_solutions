package MathsForDsa.Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxProductThree {
    public static void main(String[] args) {
        int[] arr={-100,-98,-1,2,3,4};
System.out.println(maximumProduct(arr));
    }
    public static int maximumProduct(int[] nums) {
  Arrays.sort(nums);
  int n=nums.length;
   int ans=0;
   ans=Math.max(nums[0]*nums[1]*nums[n-1], nums[n-3]*nums[n-2]*nums[n-1]);
   return ans;
    }
}
