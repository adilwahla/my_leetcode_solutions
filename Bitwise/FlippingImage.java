package BitWise;

import java.util.Arrays;

public class FlippingImage {
     public static void main(String[] args) {
        int [][] image={
            {1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}
          
        };
     int [][] ans=   flipAndInvertImage(image);
        for (int[] is : ans) {
            System.out.println(Arrays.toString(is));
        }
     }
     public static int[][] flipAndInvertImage(int[][] image) {
        for (int r = 0; r < image.length; r++) {
          //swap xor 1
          int start=0;int end=image[r].length-1;
          while(start<=end){
            int temp=image[r][start];
            image[r][start]=image[r][end] ^ 1;
            image[r][end]=temp ^ 1;
            start++;end--;
          }
        }
        return image;
    }
   
}
