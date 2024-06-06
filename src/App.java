import Materia.Models.Pantallas;
import Materia.Pilas.PilaGenerica;
import Materia.Pilas.Pilas;
import Materia.Queue;
import Materia.QueueGen;
import Materia.Ejercicio_01_sign.SignValidator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("¡Hola, Mundo!");
        // ---------------------------------------------------------------------------------------
        Pilas pila = new Pilas();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);
        pila.push(60);
        pila.push(70);
        // ---------------------------------------------------------------------------------------
        System.out.println("Elemento en la cima de la pila es: " + pila.peek());
        System.out.println("Elemento eliminado de la pila es: " + pila.pop());
        System.out.println("Elemento en la cima de la pila es: " + pila.peek());
        // ---------------------------------------------------------------------------------------
        System.out.println();
        // Implementacion de pila generica.
        PilaGenerica<Pantallas> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push(new Pantallas("Home Page", "/home"));
        pilaPantallas.push(new Pantallas("Menu Page", "/home/menu"));
        pilaPantallas.push(new Pantallas("Settings Page", "/home/menu/settings"));
        // ---------------------------------------------------------------------------------------
        System.out.println("Estoy en la pantalla: \n\t ----> " + pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla: \n\t ----> " + pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla: \n\t ----> " + pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantallas("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla: \n\t ----> " + pilaPantallas.peek().getNombre());
        // ---------------------------------------------------------------------------------------
        // Implementación de de la cola generica tipo pantalla.
        Queue queue = new Queue();
        // ----------------------------------------------------------
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);
        // ----------------------------------------------------------
        // Mostrar el elemento en el frente.
        System.out.println("Elemento en el frente: " + queue.peek());
        // ----------------------------------------------------------
        // Retirar elementos de la cola.
        System.out.println("Elemento retirado[1]: " + queue.remove());
        System.out.println("Elemento en el frente[1]: " + queue.peek());
        // -------------------------------------------------------------
        System.out.println("Elemento retirado[2]: " + queue.remove());
        System.out.println("Elemento en el frente[2]: " + queue.peek());

        // Verificar si la cola está vacía
        System.out.println("¿Cola vacía: " + (queue.isEmpty() ? "Si" : "No"));// False

        QueueGen<Pantallas> queueGen = new QueueGen<>();
        queueGen.addNode(new Pantallas("1", "Home Page"));
        queueGen.addNode(new Pantallas("2", "Menu Page"));
        queueGen.addNode(new Pantallas("3", "Settings"));

        System.out.println("Estoy en la pantalla \t" + queueGen.peek().getNombre());
        System.out.println("Pantalla destruida \t" + queueGen.remove().getNombre());

        queueGen.addNode(new Pantallas("4", "User Page"));
        System.out.println("Estoy en la pantalla \t" + queueGen.peek().getNombre());
        System.out.println("Pantalla destruida \t" + queueGen.remove().getNombre());
        System.out.println("Estoy en la pantalla \t" + queueGen.peek().getNombre());
        System.out.println("El tamaño es: " + queueGen.size());

        SignValidator validador = new SignValidator();
        String input = "{)}";

        System.out.println("El validador de signos retorna: " + validador.isValid(input));
    }
}
