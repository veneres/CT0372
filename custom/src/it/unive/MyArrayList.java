package it.unive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A simple example to simulate an ArrayList
 * @param <T> element class
 */
public class MyArrayList<T> implements Iterable<T> {

    private T[] container;

    public MyArrayList(int dim){
        this.container = (T[])new Object[dim];

    }

    public T get(int index){
        if(index < 0 || index >= container.length){
            throw new NoSuchElementException();
        }
        return container[index];
    }

    public void set(int index, T value){
        if(index < 0 || index >= container.length){
            throw new NoSuchElementException();
        }
        container[index] = value;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int actualIndex = 0;
            @Override
            public boolean hasNext() {
                return actualIndex < container.length;
            }

            @Override
            public T next() {
                T res = container[actualIndex];
                actualIndex++;
                return res;
            }
        };
    }


    public static void main(String[] args) {
        // MyArrayList Implementation
        System.out.println("MyArrayList");
        MyArrayList<String> a = new MyArrayList<>(10);
        a.set(5, "Happy");
        a.set(6, "Christmas");
        for (String s : a) {
            System.out.println(s);
        }
        // ArrayList implementation
        System.out.println("\nArrayList\n");
        ArrayList<String> b = new ArrayList<>();
        for (int i=0; i < 10; i++) {
            b.add(null);
        }
        b.set(5, "Happy");
        b.set(6, "Christmas");
        for (String s : b) {
            System.out.println(s);
        }
        // handwritten foreach
        System.out.println("\nHandwritten\n");
        Iterator<String> iterator = b.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


}
