/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Challenge4 {
    public static void main(String[] args) {
        System.out.println("Números primos presentes entre el 1 y el 100:\n");
        for(int i = 1; i <= 100; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
           if(num % i == 0){
               return false;
           }
        }
        return true;
    }
}
