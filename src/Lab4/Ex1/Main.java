package Lab4.Ex1;

public class Main {
    public static void main(String[] args) {
        Class1 obj = new Class1();

        try {
            boolean found = obj.Method1("Hashim");
            System.out.println("User found: " + found);
        } catch (MyException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Method1 execution completed.");
        }

        try {
            obj.Method2(-5); // This will throw exception
        } catch (MyException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Method2 executed.");
        }

        try {
            obj.Method3(7); // This will throw exception
        } catch (MyException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Method3 executed");
        }
    }
}