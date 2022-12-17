package Recursion.Lecture4Recurrsion;

public class Patterns {
      public static void main(String[] args) {
        triangle2(4, 0);
       
      }
public static void triangle2(int r, int c){
    if(r<=0){
        return;
    }
    if(c<r){
        triangle2(r, c+1);
        System.out.print("* ");
    }else{
        triangle2(r-1, 0);
        System.out.println();
    }
}
    private static void triangle(int r, int c) {
      if(r<=0){
        return;
      }
      if(c<r){
        System.out.print("* ");
        triangle(r, c+1);
      }
      else{
        System.out.println();
        triangle(r-1, 0);
      }
    }

    public static void tri(int n){
        for (int r = 0; r <n; r++) {
            for (int c = 0; c <n-r ; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
