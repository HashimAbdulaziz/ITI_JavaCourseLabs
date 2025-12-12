package Lab4.Ex1_1;

import java.util.ArrayList;

public class Tester {
    public void test(ArrayList<? extends Shape> shapes){
        for(Shape shape : shapes){
            shape.draw();
        }
    }

}

/* public class Tester {
    public void test(ArrayList<?> shapes){
        for(Shape shape : shapes){
            shape.draw();
        }
    }

}*/
