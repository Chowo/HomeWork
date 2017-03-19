package Lec6;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Wowa on 19.03.2017.
 */
public class MyList<T> implements List<T> {
    public static void main(String[] args) {
        MyList<Integer> l = new MyList<>();
        l.add(89);
        l.add(48);
        for (Integer i : l) {
            System.out.println(i);
        }
    }

    Object[] data = new Object[0];
    int size=data.length;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
       return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i <size ; i++) {
            if(data[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return data.clone();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        Object[] tmp=new Object[data.length+1];
        System.arraycopy(data, 0, tmp,0, data.length);
        tmp[data.length]=t;
        data=tmp;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        List list = new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            if (!data[i].equals(o)){
                list.add(data[i]);

            }

        }
        list.toArray(data);
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {

        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        Object[] tmp=new Object[0];
        data=tmp;

    }

    @Override
    public T get(int index) {
        return (T) data[index];
    }

    @Override
    public T set(int index, T element) {
        data[index]=element;
        return (T) data[index];
    }

    @Override
    public void add(int index, T element) {
        Object[] tmp=new Object[data.length+1];
        if(index==0){
            tmp[index]=element;
            System.arraycopy(data, 1, tmp, 1, data.length);
        } else {
            System.arraycopy(data, 0, tmp, 0, index - 1);
            tmp[index]=element;
            System.arraycopy(data, index, tmp, index+1, data.length-index);
        }
        data=tmp;
    }

    @Override
    public T remove(int index) {
        Object[] tmp=new Object[data.length-1];
        if(index==0){
            System.arraycopy(data, 1, tmp, 0, size - 1);
        } else {
            System.arraycopy(data, 0, tmp, 0, index - 1);
            System.arraycopy(data, index + 1, tmp, index, size - 1);
        }
        data=tmp;
        return (T) data;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i <size ; i++) {
            if(data[i].equals(o)){
                return i;
            }
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size-1; i >=0 ; i--) {
            if(data[i].equals(o)){
                return i;
            }
        }
        return 0;

    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
