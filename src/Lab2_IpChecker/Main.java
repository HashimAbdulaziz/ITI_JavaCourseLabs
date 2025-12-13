package Lab2_IpChecker;//import java.lang.String;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args){
    String word = "ITI";
    String sentance = "ITI develops people and ITI house of developers and ITI for people";
    
    // Method 1
    WordCounter wordcounter = new WordCounter();
    int res = wordcounter.CountWord1(sentance, word);
    System.out.println("counter1 = " + res);
    
    // Method 2
    res = wordcounter.CountWord2(sentance, word);
    System.out.println("counter2 = " + res);
    
    // Tokenizer
    StringTokenizer tokens = new StringTokenizer(sentance ,word);
    
    int cont = 0;
    while(tokens.hasMoreTokens()){
      cont++;
      tokens.nextToken();
    }
    System.out.println("count tokens = " + cont);
    
    
    String ipv4 = "192.168.0.1.0";
    String ipv4_1 = "192.168.0.0";
    
    IpChecker checker = new IpChecker();
    System.out.println(checker.isValid(ipv4) ? "Valid" : "not valid");
    System.out.println(checker.isValid(ipv4_1) ? "Valid" : "not valid");
    
  
  
  
  
  
  }






}
