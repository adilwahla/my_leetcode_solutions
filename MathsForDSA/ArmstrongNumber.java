package MathsForDsa.Assignments;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }
    static String armstrongNumber(int n){
        int sum=0;int num=n;
        // code here
        if(n<0){
            return "No";
        }
        while(num>0){
            
            int digit=num%10;
            sum+=Math.pow(digit,3);
             num=num/10;
        }
        if(sum==n){
            return "Yes";
        }
        return "No";
    }
}
