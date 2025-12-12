package Lab4.Ex1;

public class Class1 {

    String[] users = {"Hashim", "Ahemed", "Ali"};

    public boolean Method1(String name) throws MyException {
        for (String user : users) {
            if (user.equals(name)) {
                return true;
            }
        }
        throw new MyException("user not found !" + name);
    }

    public void Method2(int age) throws MyException {
        if (age < 1) {
            throw new MyException("age must be a positive");
        }
    }

    public void Method3(int numb) throws MyException {
        if (numb % 2 != 0) {
            throw new MyException("number must be even");
        }
    }
}