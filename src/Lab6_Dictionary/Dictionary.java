package Lab6_Dictionary;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Dictionary {
    int wordCount;
    //Map<Character, String> dictBook = new TreeMap<>();
    Map<Character, SortedSet<String>> dictBook = new TreeMap<>();

    public Dictionary() {
        this.dictBook = dictBook;
        wordCount = 0;
    }

    public int getWordCounts() {
        return wordCount;
    }

    public void printAllWords(){
        for(Map.Entry<Character, SortedSet<String>> pair : dictBook.entrySet()){
            char letter = pair.getKey();
            SortedSet<String> words = pair.getValue();

            System.out.println("========== "+ letter + " ==========");
            for(String word : words){
                System.out.println(word);
            }
        }
    }

    public void addWord(String word){
        word = word.toLowerCase();
        SortedSet<String> letterWords = new TreeSet<>();

        if(dictBook.containsKey(word.charAt(0))){
            letterWords = dictBook.get(word.charAt(0));

            if(letterWords.contains(word) == false) wordCount++;

            letterWords.add(word);
            dictBook.put(word.charAt(0), letterWords);
        }
        else {
            letterWords.add(word);
            dictBook.put(word.charAt(0), letterWords);

            wordCount++;
        }

    }
}
