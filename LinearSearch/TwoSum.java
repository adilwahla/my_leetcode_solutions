public class TwoSum {
    public int[] twoSum(int[] arr, int target) {
        int start=0;int end=arr.length-1;int[] result={1,1};
        while(start<end){
            if(arr[start]+arr[end]==target){
                result[0]+=start;
                result[1]+=end;
                return result;
            }
            if(arr[start]+arr[end]>target){
                end--;
            }else{
            start++;    
            }
        }
        return result;
    }
}
