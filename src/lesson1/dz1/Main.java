package lesson1.dz1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mass<Integer> mass = new Mass<>(1,2,3,4,5);
        mass.replacer(mass.getArray(), 0,1);
        mass.writer(mass.getArray());

    }


}
