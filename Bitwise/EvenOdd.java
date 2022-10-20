package BitWise;

public class EvenOdd {
     public static void main(String[] args) {
        int num=67;
        System.out.println(evenOdd(num));
     }

    private static boolean evenOdd(int num) {
        return (num &1)==1;
    }

}
