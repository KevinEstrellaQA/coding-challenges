/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Boolean) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;

public class Challenge2 {
    public static void main(String[] args) {
        System.out.println(areAnagrams("roma", "amor"));
    }
    static boolean areAnagrams(String word1, String word2){
        if(word1.equalsIgnoreCase(word2)){
            return false;
        }else{
            char[] firstWord = word1.toLowerCase().toCharArray();
            char[] secondWord = word2.toLowerCase().toCharArray();
            Arrays.sort(firstWord);
            Arrays.sort(secondWord);
            return Arrays.equals(firstWord, secondWord);
        }
    }
}
