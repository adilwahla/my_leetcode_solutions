package Recursion;

public class PalindromicPartitions {
     public static void main(String[] args) {
       System.out.println( allPalindromicCuts("geeks"));
     }

    private static String allPalindromicCuts(String s) {

        char[] arr=s.toCharArray(); String result="";
        int start;int end;
   for (int i = 0; i < arr.length; i++) {
    start=i; end=i;
    while(start>=0 && end<arr.length && arr[start]==arr[end]){
        result+=" "+s.substring(start, end+1);
        start--;end++;
    }
    
   }
 
        for (int i = 0; i < arr.length; i++) {
            start=i;end=start+1;
            while(start>=0 && end<arr.length && arr[start]==arr[end]){
                result+=" "+s.substring(start, end+1);
                start--;end++;
            }
           }
 return  result;
    }
}
