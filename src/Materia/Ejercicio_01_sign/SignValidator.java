package Materia.Ejercicio_01_sign;

import java.util.Stack;

public class SignValidator {
    public boolean isValid(String s) {
        Stack<Character> pila = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
                //return true;

            } else {
                if (pila.isEmpty())
                return false;

            }
            char top = pila.peek();
            if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                pila.pop();
            } else {
                return false;
            }
        }
        return pila.isEmpty();

    }

}
