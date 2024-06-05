package Materia;

import java.util.NoSuchElementException;
import Materia.Models.NodoGenerico;

public class QueueGen<T> {
    private NodoGenerico<T> first;
    private NodoGenerico<T> last;
    private int tamano;

    public QueueGen() {
    first = null;
    last = null;
    tamano = 0;

    }

    public void addNode(T data) {
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(data);
        if (isEmpty()) {
            first = nuevoNodo;
            last = nuevoNodo;
            tamano = 1 + tamano;
        } else {
            last.next = nuevoNodo;
            last = nuevoNodo;
            tamano = 1 + tamano;
        }

    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T value = first.data;
        first = first.next;

        if (first == null) {
            last = null;

        }
        return value;

    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size(){
        
        return tamano;
    }

}
