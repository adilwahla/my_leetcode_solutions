class Solution {
    public int countPrimes(int n) {
       
        boolean[] primes=new boolean[n+1];
      int ans=  sieve(n-1,primes);
      return ans; 
    }
           // false in array means number is prime 
  public int sieve(int n, boolean[] primes) {
        int count=0;
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
          count++;
        }
     }
     return count;
    }
}
