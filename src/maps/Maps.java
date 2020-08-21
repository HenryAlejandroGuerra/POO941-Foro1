/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.HashMap;

/**
 *
 * @author steve
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * HashMap: Almacena "llaves" y "valores"
         *
         * Las claves pueden ser de cualquier tipo de objetos, aunque los más
         * utilizados como clave son los objetos predefinidos de Java como
         * String, Integer, Double
         */
        /**
         *
         * ¿Cómo se declaran?
         *
         * Se declaran definiendo primero el tipo de la "llave"
         *
         * Luego el tipo del "valor"
         *
         * Se asigna un nombre y se crea una instancia de HashMap
         */
        HashMap<Integer, String> alumnos = new HashMap<>();

        /**
         * ¿Cómo se pueden asignar valores?
         *
         * Se llama al metodo put y se pasan las "llaves" y los "valores"
         *
         */
        alumnos.put(20190199, "Steven Diaz");
        alumnos.put(20160452, "Julissa Hernandez");
        alumnos.put(20201252, "Valerio Diaz");
        alumnos.put(20202020, "Alumno de Prueba");

        /**
         * ¿Cómo se eliminan valores?
         *
         * Se llama el metodo "remove" y se pasa la "llave"
         *
         * También se puede borrar todos los elementos del HashMap con "clear"
         */
        alumnos.remove(20202020);

        /**
         * Para recorrer un HashMap existen diferentes opciónes
         *
         * Se puede utilizar un for-each convencional o funcional
         *
         * Se puede imprimir solo las llaves o solo los valores
         *
         */
        
        System.out.println("Imprimiendo unicamente las llaves");
        
        for (Integer i : alumnos.keySet()) {
            System.out.println(i);
        }
        
        System.out.println("\nImprimiendo unicamente los valores");
        
        for (String i : alumnos.values()) {
            System.out.println(i);
        }
        
        System.out.println("\nImprimiendo unicamente llaves y valores, utilizando un forEach funcional");

        alumnos.keySet().forEach((i) -> {
            System.out.println("Código: " + i + " Nombre: " + alumnos.get(i));
        });

    }

}
