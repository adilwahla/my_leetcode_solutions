package MathsForDsa;

public class Sieve {
     public static void main(String[] args) {
        int n=37;
        boolean[] primes=new boolean[n+1];
        sieve(n,primes); 
     }
       // false in array means number is prime 
    private static void sieve(int n, boolean[] primes) {
     for (int i = 2; i*i<=n; i++) {
      if(!primes[i]){
           // make true to all multitples they are not prime 
           for (int j = i*2; j <= n; j+=i) {
            primes[j]=true;
           }
                    }
     }
     for (int i = 2; i <=n ; i++) {
        if(!primes[i]){
            System.out.print(i+ " ");
        }
     }
    }
}
