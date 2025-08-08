/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

import java.util.ArrayList;

public class Challenge3 {
    public static void main(String[] args) {
        ArrayList<Long> fibonacci = new ArrayList<>();
        int count = 0;
        while (fibonacci.size() < 50) {
            if (!fibonacci.isEmpty() && fibonacci.size() >= 2) {
                fibonacci.add(fibonacci.get(count - 2) + fibonacci.get(count - 1));
            } else {
                fibonacci.add((long) count);
            }
            count++;
        }
        System.out.println("\nPrimeros 50 números de la sucesión de Fibonacci:\n");
        System.out.println(fibonacci);
        System.out.println("\nLista de elementos:\n");
        for (long number : fibonacci) {
            System.out.println(number);
        }
    }
}
