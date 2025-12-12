package Lab4.Ex4;

public class Main {
    public static void main(String[] args) {
        String string1 = "Hashim";
        String string2 = "I'm tired";

        String longString = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length()>s2.length());
        System.out.println(longString);
        String firstString = StringUtils.betterString(string1, string2, (s1, s2) -> true);
        System.out.println(firstString);
    }
}
