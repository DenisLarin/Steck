package ru.larin.steck;

/**
 * Created by mrden on 26.10.2016.
 */
public class Steck<E> implements ISteck<E>{
    private int size;
    private Node<E> top;
    @Override
    public void push(E object) {
        Node node = new Node(object);
        node.setNextElementLink(top);
        top = node;
        size++;
    }

    @Override
    public E pop() {
        E removeObj = null;
    if(!isEmpty()) {
        removeObj = (E) top.getData();
        top = top.getNextElementLink();
        size--;
    }
        return removeObj;
    }

    @Override
    public E back() {
        return top.getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        while (size()!=0){
            pop();
            size--;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
