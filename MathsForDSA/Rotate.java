package MathsForDsa.Assignments;

import java.util.Arrays;

public class Rotate {
     public static void main(String[] args) {
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
      
     }
     public static void rotate(int[][] matrix) {
      
            
                //last row -> 1st col
             int start=0;  int end=matrix[0].length-1;int top=0;int bottom=matrix[0].length-1; 
               while(start<end){
              for (int i = 0; i < end-start; i++) {
                   // save topleft in temp
             int topLeft=matrix[top+i][start];
             //  swap start bottom
                 matrix[top+i][start]=matrix[bottom-i][start];  
                //right bottom in left bottom
                matrix[bottom-i][start]=matrix[bottom][end-i];  
                //top end in bottom end 
                matrix[bottom][end-i]=matrix[top+i][end];  
                 //top end in start end 
             matrix[top+i][end]=topLeft; }
             start++; end--; 
               
     
            }
        }
    }
        
    

