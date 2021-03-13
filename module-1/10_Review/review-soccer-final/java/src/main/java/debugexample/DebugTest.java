package debugexample;

import java.util.ArrayList;
import java.util.List;

public class DebugTest {

    public static void main(String[] args) {

        Integer firstNum = 1;
        Integer secondNum = 2;

        List<Integer> numsList = new ArrayList<Integer>();
        numsList.add(firstNum);
        numsList.add(secondNum);

        System.out.println("Hello World");

        for (int i=0; i < 10000; i++) {

            if (i == 2345) {
                System.out.println(i % 2);
            }
        }
    }
}
