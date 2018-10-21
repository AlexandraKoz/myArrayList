public interface Simple <E> extends Iterable <E>{
    boolean myAdd(E e);
    void myDelete(int index);
    E myGet(int index);
    int mySize();
    void myUpdate(int index, E e);
    void myPrintList();
}
