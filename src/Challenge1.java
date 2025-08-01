/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class Challenge1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            boolean fizz = (i % 3 == 0);
            boolean buzz = (i % 5 == 0);
            if(fizz && buzz){
                System.out.println("fizzbuzz");
            }else if(fizz){
                System.out.println("fizz");
            }else if(buzz){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
