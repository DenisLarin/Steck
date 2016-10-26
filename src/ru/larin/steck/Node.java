package ru.larin.steck;

/**
 * Created by mrden on 26.10.2016.
 */
public class Node<E>{
    private E data;
    private Node nextElementLink;

    public Node(E data){
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNextElementLink() {
        return nextElementLink;
    }

    public void setNextElementLink(Node<E> nextElementLink) {
        this.nextElementLink = nextElementLink;
    }
}
