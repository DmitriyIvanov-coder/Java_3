package lesson1.dz3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> boxA1 = new Box<>();
        Box<Apple> boxA2 = new Box<>();
        Box<Orange> boxO1 = new Box<>();

        boxA1.put(new Apple(), new Apple(), new Apple());
        boxA2.put(new Apple(), new Apple(), new Apple(), new Apple(), new Apple());
        boxO1.put(new Orange(), new Orange());

        System.out.println(boxA1.compare(boxO1));


    }
}
