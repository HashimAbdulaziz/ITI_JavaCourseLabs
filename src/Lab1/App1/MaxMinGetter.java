package Lab1.App1;

public class MaxMinGetter {
  
  int getMin(int[] A){
    int min = A[0];
    for(int i = 1; i < A.length; i++){
      if(A[i] < min){
        min = A[i];
      }
    }
    return min;
  }

  int getMax(int[] A){
    int max = A[0];
    for(int i = 1; i < A.length; i++){
      if(A[i] > max){
        max = A[i];
      }
    }
    return max;
  }


}
