package Recursion;

public class UpperCaseLetter {
     public static void main(String[] args) {
        String s="geeksforgeeKs";
       System.out.println( firstUpperCaseRecurrsion(s,0));
     }

     private static char firstUpperCaseRecurrsion(String s,int n) {
        //base condition
        if(n==s.length()){
            return 0;}
   boolean exp=Character.isUpperCase(s.charAt(n));
 //  int nextIndex=n+1;
         return  (exp)? s.charAt(n): firstUpperCaseRecurrsion(s, n+1);
     
     }





    private static char firstUpperCase(String s) {
for (int i = 0; i < s.length(); i++) {
   
      if(Character.isUpperCase(s.charAt(i))){
        return s.charAt(i);
      }
    
}
return 0;
    }

}
