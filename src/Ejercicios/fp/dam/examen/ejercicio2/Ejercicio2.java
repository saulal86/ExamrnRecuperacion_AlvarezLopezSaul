package Ejercicios.fp.dam.examen.ejercicio2;

import java.util.*;

public class Ejercicio2 {


    public void cuentaPares(List<String> palabras) {
        HashMap<String, Integer> resultado = new HashMap<>();
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length() - 1; i++) {
                String par = palabra.substring(i, i + 2);
                resultado.put(par, resultado.getOrDefault(par, 0) + 1);// el metodo este de getOrDefault lo acabo de descubrir bastante mas comodo que dar valores por ahi a variables y ponerlas de values
            }
        }
        System.out.println(resultado);
    }
    //este metodo lo hace de dos letras en dos letras porque ns como poner que vaya de una en una :-( y el otro metodo no tengo muy claro como se hace y paso de liar alguna

    public static void main(String[] args) {
        Ejercicio2 e = new Ejercicio2();
        List<String> palabras = new ArrayList<>();
        palabras.add("banana");
        palabras.add("pera");
        palabras.add("melon");
        palabras.add("manzana");
        e.cuentaPares(palabras);
    }

}
