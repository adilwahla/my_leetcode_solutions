package Recursion;
public class Geekonacci {
  public static void main(String[] args) {
    int ans=geekFibo(1,3,2,4);
    System.out.println(ans);
  }
  public static int geekFibo(int a,int b,int c,int n){
    //base condition

    if(n==1){
        return a;
    }
    if(n==2){
        return b;
    }
    if(n==3){
        return c;
    }
    return geekFibo(a,b,c,n-1)+geekFibo(a,b,c,n-2)+geekFibo(a,b,c,n-3);
}
}
