package MathsForDsa;

public class NewtonSQRT {
     public static void main(String[] args) {
        double n=40;
        System.out.println(sqrt(n));
     }

    private static double sqrt(double n) {
        double x=n;double root;
        // newton formula
     
        while (true) {
            root=0.5 * (x+(n/x));
            if(Math.abs(root-x)<1){
                break;
            }
             x=root;
        }
        return root;
    }
}
