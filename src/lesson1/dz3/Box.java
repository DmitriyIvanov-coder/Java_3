package lesson1.dz3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit > {
    private List<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void setFruits(List<T> fruits) {
        this.fruits = fruits;
    }
    public void clear(){
fruits.clear();
    }

    public double getWeight() {
        double w = 0;
        for (int i = 0; i < fruits.size(); i++) {
            w += fruits.get(i).getFruitWeight();
        }
        return w;
    }

    public boolean compare(Box<?> box){
        return Math.abs(getWeight()-box.getWeight())<0.0001;
    }

    public void peres(Box<T> box){

            fruits.addAll(box.getFruits());
            box.clear();

    }

    public void put(T fruit){
        this.fruits.add(fruit);

    }

    public void put(T... fruit){
        this.fruits.addAll(Arrays.asList(fruit));

    }

}
