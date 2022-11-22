package MathsForDsa.Assignments;

public class DecimalTOBinary {
     public static void main(String[] args) {
 
       // String ans=decimalToBinaryUsingArray(17);
       // String ans=decimalToBinaryBitwise(2);
     //   int ans=decimalToBinaryUsingMathdotPow(7);
        System.out.println(addBinary("1110110101","1110111011"));
     }
public static String addBinary(String a,String b){
    int num1=Integer.parseInt(a,2);
    int num2=Integer.parseInt(b,2);
    int ans=num1+num2;
    // convert to binary 
   int result= decimalToBinaryUsingMathdotPow(ans);
    return Integer.toString(result) ;
}


     //fisrt method using Math.pow 
    public static int decimalToBinaryUsingMathdotPow(int N)
    {
  
        // To store the binary number
        int B_Number = 0;
        int cnt = 0;
        while (N != 0) {
            int rem = N % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            N /= 2;
  
            // Count used to store exponent value
            cnt++;
        }
  
        return B_Number;
    }
     //second way using bitwise right shift 
     public static String decimalToBinaryBitwise(int n){
        StringBuilder sb=new StringBuilder();
      for (int i = 31; i >=0; i--) {
        int k=n>>i;
        if((k&n)>0){
            sb.append("1");
        }else{
            sb.append("0");
        }
      }
      return sb.toString();
     }
 public static String decimalToBinaryUsingArray(int n) {
        //using binary array
   int[] arr=new int[1000];
   int i=0;
while(n>0){
    arr[i]=n%2;
    n=n/2;
    i++;
}
StringBuilder sb=new StringBuilder();
for (int j = i-1; j >= 0; j--) {
   sb.append(arr[j]);
}
return sb.toString();
    }
}
