package lesson1.dz1;

public class Mass<T extends Number> {

    private T[] array;

    public Mass(T... array) {
        this.array=array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void replacer(T[] array, int a, int b){

        T c = array[a];
        array[a] = array[b];
        array[b]=c;

    }

    public void writer(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

}
