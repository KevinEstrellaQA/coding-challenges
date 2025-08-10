/*
 * Crea un programa que reciba dos entradas por teclado (System.in): Total de personas y rebanadas por pizza
 * Calcular la cantidad mínima de pizzas que se requieren para que cada persona reciba la misma cantidad de rebanadas
 * sin que queden rebanadas sobrantes.
 * Asumir que los valores son siempre positivos.
 */

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people:");
        int people = scanner.nextInt();
        System.out.println("How many slices per pizza:");
        int slices = scanner.nextInt();
        System.out.println(pizzasNeeded(people, slices));
    }
    public static int pizzasNeeded(int people, int slices) {
        if(slices > people && slices % people == 0) return 1;
        int pizzas = 1;
        while(!(pizzas * slices % people == 0)){
            pizzas++;
        }
        return pizzas;
    }
}
