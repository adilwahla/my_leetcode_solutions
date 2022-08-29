package BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {
    public static void main(String[] args) {
      char [] letters=  {'a','c','f','i','o','q'};
       char target='c';
       char ans= nextGreatestLetter(letters, target);
       System.out.println(ans);
    }


   
    public static char NextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) start = mid + 1;
            else end = mid;
        }
        return letters[start % letters.length];
    

}


    // my code
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
       
      
    

        while(start <= end){
            int mid= start + (end-start)/2;
                if(target>=letters[mid]){
                    // move right for Ascending order
                    start= mid+1;
                }
                else{
                    // move left in ascending order
                    end= mid-1;
                }
            
            }
        return letters[start%letters.length];

    }
}

