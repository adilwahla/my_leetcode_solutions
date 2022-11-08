package MathsForDsa.Assignments;

public class Power {
     public static void main(String[] args) {
       System.out.println( myPow(0.00001, 2147483647));
     }
     public static double myPow(double x, int n) {
        double ans=1;int sign=1;
         if(n<0){
             sign=-1;
             n=-n;
         }
        double pow=n;
        while(pow>0){
            if(pow%2==0){
                ans=ans*x;
                pow-=1;
            }
            else
        }
        
     
         if(sign==-1){
             return 1/ans;
         }
      
     }
}
