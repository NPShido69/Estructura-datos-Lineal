package Materia.Ejercicio_02_sorting;

import java.util.Stack;

public class StackSorte {
    public  static void sortStack(Stack<Integer> stack) {
        Stack<Integer> auxPila = new Stack<>();

        while (!stack.isEmpty()) {
            int variabac = stack.pop();
            while (!auxPila.isEmpty() && auxPila.peek() >variabac) {
                stack.push(auxPila.pop());
            }
            auxPila.push(variabac);
        }

        while (!auxPila.isEmpty()) {
            stack.push(auxPila.pop());
        }
    }
    
}
