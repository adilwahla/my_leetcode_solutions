package Recursion.Questions;

public class CountZeros {
     public static void main(String[] args) {
        countZero(203040500);
        System.out.println(count);
     }
static int count=0;
    private static void countZero(int num) {
      if(num%10==num){
        return;
      }
        int rem=num%10;
      if(rem==0){
        count++;
      }
      countZero(num/10);
    }
}
