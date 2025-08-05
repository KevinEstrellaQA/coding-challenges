/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Challenge4 {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++){
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count <=2){
                System.out.println(i);
            }
        }
    }
}
