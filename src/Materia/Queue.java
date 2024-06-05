package Materia;

import java.util.NoSuchElementException;
import Materia.Models.Node;

public class Queue {
    private Node first;
    private Node last;

    public void Cola (){
        this.first = null;
        this.last = null;
    }

    //Método para agregar un NOde a la cola
    public void addNode(int value){
        Node nuevoNodo = new Node(value);
        if(isEmpty()){

            first = nuevoNodo;
            last = nuevoNodo;
        } else {

            last.next = nuevoNodo;
            last = nuevoNodo;
        }

    }
    public int remove (){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int value = first.value;
        first = first.next;
        if(first == null){
            last = null;

        }
        return value;

    }
    public int peek (){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return first.value;

    }

    public boolean isEmpty(){
        return first == null;
    }
    
}
