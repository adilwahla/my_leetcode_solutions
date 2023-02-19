import java.util.Arrays;

public class MergeSortRecursive {
       public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        //int[] ans=mergeSort(arr);
        mergeSortInPlace(arr, 0,  arr.length);
        System.out.println(Arrays.toString(arr));
       }

    private static int[] mergeSort(int[] arr) {
     // mergeSort
     /*
      * 1) divide array into tgwo parts 
        2)get both parts sorted vis recurrsion 
        3) merge them 
      */
      // base condition 
      if( arr.length==1){
        return arr;
      }
      // divide array into half
      int mid=arr.length/2;
      int [] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
      int [] right=mergeSort(Arrays.copyOfRange(arr,  mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix=new int[left.length+right.length];
        int i=0;
        int j=0;
         int k=0;
         while(i<left.length && j< right.length){
            if(left[i]< right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
         }
         // there is possiblilty that one of arrays yet not ended
         while(i<left.length){
            mix[k]=left[i];
            i++;k++;
         }
         while (j<right.length) {
            mix[k]=right[j];
            j++;k++;
            
         }
        return mix;
    }
/*
 * MERGE SORT IN-PLACE 
 */
       static void mergeSortInPlace(int[] arr ,int s,int e){
        if(e-s==1){
            return ;
        }
        // divide array into two half
        int mid=(s+e)/2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
     
        mergeInPlace(arr,s,mid,e);
       }

    private static void mergeInPlace(int[]arr, int s, int m,int e) {
        int[] mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while (i< m && j <e) {
                  if(arr[i]<arr[j]){
                    mix[k]=arr[i];
                    i++;
                  }else{
                    mix[k]=arr[j];
                    j++; 
                  }
                  k++;
        }
        //it may be possible that one of array is not complete 
  while(i<m){
    mix[k]=arr[i];
    i++;
    k++;
  }
  while(j<e){
    mix[k]=arr[j];
    j++;
    k++;
  }
  for (int l = 0; l < mix.length; l++) {
   arr[s+l]=mix[l];
  
  }
    }
}
//In this implementation, mergeSort is the recursive method that divides the array into halves until the size becomes 1. The merge method is responsible for merging two sorted halves of the array into a single sorted array.

//The main method shows an example of how to use the mergeSort method on an array of integers. The expected output is a sorted array.
