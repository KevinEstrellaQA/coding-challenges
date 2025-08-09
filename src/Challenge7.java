/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class Challenge7 {
    public static void main(String[] args) {
        System.out.println(reversedString("Hola, mundo"));
    }

    public static String reversedString(String text){
        if(text.isEmpty()) return "";
        String reversed = "";
        for(int i = text.length()-1; i >= 0; i --){
            reversed = reversed.concat(String.valueOf(text.charAt(i)));
        }
        return reversed;
    }
}
