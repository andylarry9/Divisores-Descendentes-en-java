
package consola;

// Importamos las clases necesarias para utilizar ArrayList, Collections y Scanner en nuestro programa.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Declaramos la clase principal del programa llamada DivisoresDescendentes.
public class DivisoresDescendentes {
    // Comenzamos la definición del método main, que es el punto de entrada de la aplicación.
    public static void main(String[] args) {
        // Creamos un objeto Scanner llamado sc para leer la entrada del usuario.
        Scanner sc = new Scanner(System.in);
        // Solicitamos al usuario que ingrese un número entero positivo y almacenamos el valor ingresado en la variable numero.
        System.out.print("Digite un número entero mayor a cero: ");
        int numero = sc.nextInt();
// Comprobamos si el número ingresado es menor o igual a cero. Si es así, mostramos un mensaje de error. De lo contrario, continuamos con la ejecución del programa.
        if (numero <= 0) {
            System.out.println("El número debe ser mayor a cero.");
        } else {
            // Creamos un ArrayList llamado divisores y llamamos a la función encontrarDivisores para encontrar todos los divisores del número ingresado y los almacenamos en este ArrayList.
            ArrayList<Integer> divisores = encontrarDivisores(numero);
            // Imprimimos un mensaje que indica que se mostrará la lista de divisores del número ingresado en orden descendente.
            System.out.println("Lista de divisores de " + numero + " en orden descendente:");
            // Ordenamos la lista de divisores en orden descendente utilizando el método sort de la clase Collections y la clase Collections.reverseOrder().
            Collections.sort(divisores, Collections.reverseOrder());
            // Imprimimos la lista de divisores ordenados de mayor a menor.
            System.out.println(divisores);
            // Cerramos el bloque else y finalizamos el método main.
        }
    }
   // Comenzamos la definición de un nuevo método llamado encontrarDivisores que toma un número como argumento y devuelve un ArrayList de enteros.
    public static ArrayList<Integer> encontrarDivisores(int numero) {
       // Creamos un ArrayList llamado divisores para almacenar los divisores encontrados.
        ArrayList<Integer> divisores = new ArrayList<>();
        // Iniciamos un bucle que recorre desde 2 hasta la mitad del número ingresado. No es necesario verificar números más grandes, ya que no pueden ser divisores.
        for (int i = 2; i <= numero / 2; i++) {
           // Comprobamos si el número es divisible por i verificando si el residuo de la división es igual a cero.
            if (numero % i == 0) {
                // Si es divisible, agregamos i a la lista de divisores.
                divisores.add(i);
                // Finalizamos el bucle y el método encontrarDivisores y devolvemos la lista de divisores encontrados.
            }
        }
        return divisores;
    }
}
