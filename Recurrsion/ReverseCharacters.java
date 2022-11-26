package Recursion;

import java.util.Arrays;

public class ReverseCharacters {
      public static void main(String[] args) {
char [] s={'h','e','l','l','o'};
    reverseString(s,0,s.length-1);
     System.out.println(Arrays.toString(s));
      }
      public static void reverseString(char[] s,int start,int end) {
       
         if(start>=end){
            return;
         }
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
start++;end--;
          reverseString(s,start,end);
          System.out.println(Arrays.toString(s));
         }
      }

