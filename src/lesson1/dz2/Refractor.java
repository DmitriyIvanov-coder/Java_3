package lesson1.dz2;

import java.util.Arrays;
import java.util.List;

public class Refractor<T>{

    private T[] array;
    private List<T> arrayList;

    public Refractor(T... array){
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public List<T> getArrayList() {
        return arrayList;
    }

    public void refract(T[] array){
        this.arrayList=Arrays.asList(array);

    }

}
