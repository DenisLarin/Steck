package ru.larin.steck;

/**
 * Created by mrden on 26.10.2016.
 */
public interface ISteck<E> {
    public void push(E object);
    public E pop();
    public E back();
    public int size();
    public void clear();
    public boolean isEmpty();
}
