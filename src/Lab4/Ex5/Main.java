package Lab4.Ex5;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> check = (s) -> {
            for(char c : s.toCharArray()){
                if(!Character.isLetter(c)) return false;
            }
            return true;
        };

        String s1 = "Hello";
        System.out.println("s1: " + (check.test(s1) ? "only alphabets :)" : "contains alphabets:("));
        String s2 = "hell0";
        System.out.println("s2: " + (check.test(s2) ? "only alphabets :)" : "contains alphabets:("));



    }
}
