class Solution {
  //https://leetcode.com/problems/excel-sheet-column-title/    
  //very Important 
    public String convertToTitle(int n) {
        String answer="";
        while(n>0){
            char c=(char)('A'+(n-1)%26);
            answer=c+answer;
            n=(n-1)/26;
        }
        return answer;
    }
}
