package MathsForDsa.Assignments;

import java.util.ArrayList;

public class kthFactor {
     public static void main(String[] args) {
        System.out.println(kFactor(12,3));
     }
     public static int kFactor(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                list.add(i);
            }
        }
        if(list.size()<k) return -1;
        return list.get(k-1);
    }
}
