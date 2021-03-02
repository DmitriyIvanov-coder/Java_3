package lesson1.dz2;

public class Main {
    public static void main(String[] args) {

        Refractor<Integer> ref = new Refractor<>(1,2,3);
        ref.refract(ref.getArray());
        System.out.println(ref.getArrayList());

    }
}
