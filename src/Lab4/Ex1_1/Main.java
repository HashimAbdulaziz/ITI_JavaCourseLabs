package Lab4.Ex1_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Tester tester = new Tester();

        ArrayList<Rectangle> rects = new ArrayList<>();
        rects.add(new Rectangle());
        rects.add(new Rectangle());

        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle());

        tester.test(rects);
        tester.test(circles);

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(2);
        //tester.test(ints);



    }
}
