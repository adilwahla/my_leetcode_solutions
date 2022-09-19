class Solution {
  //https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0; i<patterns.length;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}
