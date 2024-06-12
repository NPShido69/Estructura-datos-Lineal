package Materia.Ejercicio_03_linkedLists;

public class LinkedListEjr {
    public Nodo head; 

    public int getByPos(int position) {
        int size = getSize();
        if (position < 1 || position > size) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        Nodo current = head;
        for (int i = 0; i < size - position; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int getSize() {
        int size = 0;
        Nodo current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public static class Nodo {
        public Nodo(int i) {
            //TODO Auto-generated constructor stub
        }
        int data;
        public Nodo next;
    }
    public void printList() {
        Nodo current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}