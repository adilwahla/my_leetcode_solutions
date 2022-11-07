package MathsForDsa.Assignments;
public class HappyNumber {
    public static void main(String[] args) {
       System.out.println( isHappy(2));
     
    }
    public static boolean isHappy(int n) {
        int sumOfSquares=0;
        while(n>0){  
           int digit=n%10;
        sumOfSquares+=Math.pow(digit, 2);
           n =n/10;
       
        }
        if(sumOfSquares==1){
            return true;
        }else if(sumOfSquares<7){
            return false;
        }
        else{
            return isHappy(sumOfSquares);
        }

    }
   
  
}
