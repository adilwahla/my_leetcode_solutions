// class Solution {
//   //https://leetcode.com/problems/power-of-two/
//     public boolean isPowerOfTwo(int n) {
//         return n>0 && (n & n-1)==0;
//     }
// }
//using recursion
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return  true;
        }
        if(n%2==0){
            return isPowerOfTwo(n/2);
        }
        
            return false;
        
    }
}
