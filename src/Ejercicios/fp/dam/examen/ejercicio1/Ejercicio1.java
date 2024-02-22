package Ejercicios.fp.dam.examen.ejercicio1;

import java.util.TreeSet;

public class Ejercicio1 {
    TreeSet<Automovil> coches = new TreeSet<>();

    public void añadir(Automovil a) {
        coches.add(a);
    }

    public void consultar(String matricula) {
        for (Automovil aut : coches) {
            if (matricula.equals(aut.getMatricula())) {
                System.out.println(aut);
            }
        }
    }

    //he sudado bastante para hacer este ejercicio mas o menos espero que lo tengas en cuenta profe, y la otra clase implementando el Comparator intente hacerla antes y no tengo muy claro como se hace ademas se me lia todo el ejercicio.

    public static void main(String[] args) {
        Ejercicio1 e = new Ejercicio1();
        Automovil a = new Automovil("ford", "ranchera", "4", 2004, "gasolina", 400);
        e.añadir(a);
        e.consultar("4");

    }
}
