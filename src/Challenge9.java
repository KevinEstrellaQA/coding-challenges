/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge9 {

    public static void main(String[] args) {
        System.out.println(binary(13));
    }

    public static String binary(int num){
        List<String> binary = new ArrayList<>(Arrays.asList("0", "0", "0", "0", "0", "0", "0", "0"));
        int count = 7;
        while(!(num / 2 == 0)){
            if(num % 2 == 1){
                binary.add(count, "1");
            }else{
                binary.add(count, "0");
            }
            count--;
            num = num / 2;
        }
        System.out.println(binary);
        return binary.toString();
    }
}
