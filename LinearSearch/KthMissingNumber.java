class Solution {
    public int findKthPositive(int[] arr, int k) {
        int result=0;int end=k+arr[arr.length-1];
        ArrayList<Integer> list=new ArrayList<>(20);
        for(int i=1;i<(end*2);i++){
            for(int element:arr){
                if(i==element){
                    i++;
                }
            }
            list.add(i);
        }
   result=list.get(k-1);
        return result;
    }
}
