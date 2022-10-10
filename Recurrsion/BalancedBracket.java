package Recursion;

import java.util.Arrays;

public class BalancedBrackets {
    public static void main(String[] args) {
        char[] exp="[()]{}{[()()]()".toCharArray();
        int n=exp.length;
        if(check(exp,n)){
            System.out.println("balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }

    private static boolean check(char[] exp, int n) {
        //base cases
        if(n==0){
            return true;
        }
        if(n==1){
            return false;
        }
        if(exp[0]==']'||exp[0]=='}'||exp[0]==')'){
            return false;
        }
      
         char charClose=   closing(exp[0]);
        
        //check how many brackets opening vs closing like this case ((()))
        //balance check
            int sum=0; int i;
       for (i = 1; i < n; i++) {
        if(exp[0]==exp[i]){
            sum++;
        }
        if(exp[i]==charClose){
            if(sum==0){
                break;
            }
        sum--;
        }
       }
       if(i==n){
        //not found 
        return false;
       }
       if(i==1){
        //got at first place
        return check(Arrays.copyOfRange(exp, i+1, n), n-2);
       }
       else{
        //found at in mid somewhere
        return check(Arrays.copyOfRange(exp, 1, n), i-1) &&check(Arrays.copyOfRange(exp, i+1, n), n-i-1);
       }
        
    }
         //get char for closing bracket
         static char closing(char c){
            if(c=='['){
               return ']';
            }
            if(c=='{'){
               return '}';
            }
            if(c=='('){
               return ')';
            }
            return Character.MIN_VALUE;
        }
}
