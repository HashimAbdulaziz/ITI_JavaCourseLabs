package Lab6_Dictionary;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("Hashim");
        dictionary.addWord("Ali");
        dictionary.addWord("ali");
        dictionary.addWord("Ahmed");
        dictionary.addWord("Fawzy");

        dictionary.printAllWords();
        System.out.println("\n\n Number of words = " + dictionary.getWordCounts());

    }
}
