package MathsForDsa;

public class BinarySearchSQRT {
    public static void main(String[] args) {
    int n=40; int p=3;
    double ans=binarySearchSqrt(n,p);
    // pretty printing can be used 
    System.out.println(ans);    
    }
// Time complexity:O log(n)
    private static double binarySearchSqrt(int n, int p) {
       int s=0; int e=n; double root=0.0;
       while(s<=e){
        int m=s+(e-s)/2;
        if(m*m==n){
            return m;
        }
        if(m*m>n){
            e=m-1;
        }
        if(m*m<n){
            s=m+1;
        }
      else{
        root=e;
      }
       }
       double incr=0.1;
       for (int i = 0; i <p; i++) {
         while(root*root<=n){
            root+=incr;
         }
   root -=incr;
   incr/=10;
       }
      return root;
    } 

}
