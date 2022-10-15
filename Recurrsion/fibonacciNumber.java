package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        //int ans=fibo(50);
        //System.out.println(ans);
      
            System.out.println(fibboFormula(50));
       
    }
public static int fibboFormula(int n){
    //try to use long 
//return (int) (((Math.pow((1+Math.sqrt(5))/2, n))-(Math.pow((1-Math.sqrt(5))/2, n)))/Math.sqrt(5));
//LESS DOMINATING TERM removed 
return (int) ((Math.pow((1+Math.sqrt(5))/2, n))/Math.sqrt(5));
}
    private static int fibo(int n) {
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
