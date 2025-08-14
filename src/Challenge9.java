/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */



public class Challenge9 {

    public static void main(String[] args) {
        System.out.println(binary(13));
    }

    public static String binary(int num){
        if(num == 0) return "0";
        String binary = "";
        while(num > 0){
            int res = num % 2;
            binary = res + binary;
            num /= 2;
        }
        return binary;
    }
}