package Materia;

import Materia.Models.Node;

public class ListasEnlazada {
    public Node head;

    public ListasEnlazada() {

    }

    // Agregar nodos a la lista.
    public void addNode(int value) {
        if (head == null) {
            head = new Node(value);
            return;

        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);

    }

    // Métoo para eliminar.
    public void deleteNode(int value) {
        if (head == null)
            return; // Si no hay elementos, que no haga nada.
        if (head.value == value) {
            head = head.next;
            return;

        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;

            }
            current = current.next;

        }

    }
    public int size (){

        return 0;
    }

    public void print(){
        if (head == null) {
            System.out.println("Lista vacia :C");
            return;

        }
        Node current = head;
        while (current.next != null) {
            System.out.println("Node -> " + current.value);
            current = current.next;

        }
        System.out.println("Node -> " + current.value);
        System.out.println("*...Fin de la lista...*");

    }

}
