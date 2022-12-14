package MathsForDsa.Assignments;

public class addBinary1 {
    public static void main(String[] args) {
         //   System.out.println(addBinary("1110110101","1110111011"));
           // System.out.println(addBinaryBigInteger("11","1"));
            System.out.println(new java.math.BigInteger("11",2).toString(2));
    }
    private static String addBinaryBigInteger(String a, String b) {
       return new java.math.BigInteger(a,2).add(new java.math.BigInteger(b, 2)).toString(2);
    }
    public static String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
          int i=a.length()-1;
          int j=b.length()-1;
          int carry=0;int sum;
          while(i>=0 || j>0){
            sum=carry;
            if(i>=0)  sum+=a.charAt(i)-'0';
            if(j>=0) sum+=b.charAt(j)-'0';
         sb.append(sum%2);
         carry=sum/2;
            i--;j--;
          }
     if(carry !=0) sb.append(carry);
          return sb.reverse().toString();
    }
}
