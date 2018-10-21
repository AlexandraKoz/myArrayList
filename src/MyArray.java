import java.util.Iterator;

public class MyArray <E> implements Simple <E> {

    private E[] values;

    public MyArray() {
        values = (E[]) new Object[0];
    }

    @Override
    public void myPrintList() {
        for (E s: values) {
            System.out.println(s.toString());
        }
    }


    @Override
    public boolean myAdd(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp,0,values,0,temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void myDelete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp,0,values,0,index);
            System.arraycopy(temp,index+1,values,index,temp.length-index-1);
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public E myGet(int index) {
        return values[index];
    }

    @Override
    public int mySize() {
        return values.length;
    }

    @Override
    public void myUpdate(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }
}

