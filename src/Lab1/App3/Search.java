package Lab1.App3;

import java.util.Arrays;

public class Search{

  int BinarySearch(int[] A, int num){
    int l = 0;
    int r = A.length - 1;
    int m;
    
    Arrays.sort(A);
    
    while(l < r){
      m = l + (r-l)/2;
    
      if(A[m] > num){
        l = m;
      }
     else if (A[m] < num){
      r = m;
     }
     else{
        System.out.println("found!");
        return m;
     
     }
     
    }
    
    System.out.println("not found!");
    return -1;
  
  
  
  
  }






}
