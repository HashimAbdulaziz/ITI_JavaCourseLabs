package Lab1.App2;

import java.util.Scanner;

public class Main {
  public static void main (String[] args){
    System.out.println("Java is the best !");
    
    /* Scanner scanner = new Scanner(System.in);
    System.out.print("put your name: ");
    String name = scanner.nextLine(); */
    

    
    if(args.length == 1){
      String word = args[0]; 
      System.out.println(word);
    }
    else if(args.length == 2){
        int num = Integer.parseInt(args[0]); // error in str
        String word = args[1];
        
        for(int i = 0; i < num; i++){
            System.out.print("\n");
        }
      System.out.println("your word: " + word);  
    }
    
    
    //System.out.print("put a word: ");
    //String word = scanner.nextLine();
    /*System.out.print("put number: ");
    int num = scanner.nextInt();
    for(int i = 0; i < num; i++){
      System.out.print("\n");
    }
    System.out.println("your word: " + word); */
  
  }

}
