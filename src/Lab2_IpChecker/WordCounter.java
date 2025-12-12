package Lab2;

import java.lang.String;

public class WordCounter {
  // Method 1s
  int CountWord1(String sent, String word){
    int cont = 0;
    
    for(int i = 0; i <= (sent.length()-word.length()); i++){
      String buffer = sent.substring(i, i + word.length());
      
        if (buffer.equals(word)) {
            cont++;
        }
      
    }
    return cont;
  }
  
  // Method 2
  int CountWord2(String sent, String word){
    int cont = 0;
    
    for(int i = 0; i < sent.length(); i++){
      int indx = sent.indexOf(word, i);
      
      if(indx == -1) break;
      i = indx+1;
      cont++;
    }
    return cont;
  
}
  
}
