/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */

import java.util.ArrayList;

public class Challenge8 {
    public static void main(String[] args) {
        repeatedWords("Hola, este es un ejemplo para ver si hay palabras repetidas. Las palabras son aleatorias y de ejemplo");
    }

    public static void repeatedWords(String text){
        String[] words = new String[]{};
        words = text.toLowerCase().split("[^\\p{L}\\p{N}]+");
        ArrayList<String> repeatedWords = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            int count = 1;
            for(int j = 0; j < words.length; j++){
                if(i == j) continue;
                if(repeatedWords.contains(words[i])) continue;
                if(words[i].equals(words[j])){
                    repeatedWords.add(words[i]);
                    count++;
                }
            }
            if(count !=1 ){
                System.out.println("Palabra: '" + words[i] + "' está repetida: " + count + " veces.");
            }
        }
        if(repeatedWords.isEmpty()) System.out.println("No hubo palabras repetidas en el texto dado.");
    }
}
