import java.util.Random;

public class Main {
  public static void main(String[] args){
    int[] A = new int[1000];
    Random rand = new Random();
    
    for(int i = 0; i < A.length; i++){
        A[i] = rand.nextInt();
    }
    
    MaxMinGetter getter = new MaxMinGetter();
    long time1 = System.nanoTime();
    int max = getter.getMax(A);
    int min = getter.getMin(A);
    long time2 = System.nanoTime();
    long running_time = time2 - time1;
    
    System.out.println("Min = " + min);
    System.out.println("Max = " + max);
    System.out.println("Searching Time = " + running_time + " ns");
    
  
  
  }
}
