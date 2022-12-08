package Recursion.Questions;

public class ReverseNum {
     public static void main(String[] args) {
      System.out.println(reverse1(4321) );
    System.out.println(  palindrome(1213));
     }

     /*
      * MEHTOD TWO TO SOLVE 
      */
public static int reverse(int n){
    /*
     * SOMETIMES YOU MIGHT NEED SOME ADDITIONAL VARIABLES FOR THAT USE 
     * HELPER FUNCTION 
    */
    int digits=(int)Math.log10(n)+1;
  
   return   helper(n,digits);
}
    private static int helper(int n, int digits) {
         if(n%10==n){
            return n;
         }
         int rem=n%10;

    return rem*(int)Math.pow(10,digits-1 )+helper(n/10, digits-1);
}
/* 
    METHOD ONE TO SOLVE 
    */  
   static  int sum=0;
    public static int reverse1(int n) {
  
        if(n==0){ return sum;}
        int rem=n%10;
        sum=sum*10+rem;
          return reverse1(n/10);
    }

    public static boolean palindrome(int n){
        return (n==reverse(n));
    }
      
}
