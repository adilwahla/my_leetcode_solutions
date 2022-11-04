package MathsForDsa.Assignments;

public class DivideTwoNum {
     public static void main(String[] args) {
 // System.out.println(divide(-2147483647,3));
 System.out.println(divide(10,3));
     }
     public static int divide(int dividend, int divisor) {
        // return (dividend-((int)dividend % divisor))/divisor;
if((dividend==1<<31) && (divisor==-1)) return Integer.MAX_VALUE;
        int sign=(dividend<0) ^ (divisor<0) ?-1:1;
         dividend=Math.abs(dividend);
         divisor=Math.abs(divisor);
        
        int quotient=0;
        while(dividend-divisor>=0){
            int count=0;
            while(dividend-(divisor<<1<<count)>=0){
                count++;
            }
         dividend-=divisor<<count;
         quotient+=1<<count;
        }
        if(sign==-1){
            quotient=-quotient;
        }
        return quotient;
     }
}
