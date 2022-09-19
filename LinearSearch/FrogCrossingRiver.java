public class FrogCrossingRiver {
    public static void main(String[] args) {
        System.out.println("There are "+numberOfWays(11)+ " ways for frog to cross The River");
    }
public static int numberOfWays(int n){
    // if (n<0){
    //     return -1;// not valid
    // }
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
return numberOfWays(n-1)+numberOfWays(n-2);
}
}
