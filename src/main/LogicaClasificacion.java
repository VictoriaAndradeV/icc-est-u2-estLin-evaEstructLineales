package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {
        //victoria
        Queue<String> colaInvertida = new LinkedList<String>();
        
        while(!cola.isEmpty()){ //se realiza hasta que la cola original no tenga elementos
            colaInvertida.add(cola.poll());
        }

        return colaInvertida;
        //new LinkedList<>(Arrays.asList()); // Simulación de resultado
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(String texto) {

        Queue<Character> aux = new LinkedList<Character>();

        //a n i l i n a
        //0 1 2 3 4 5 6 

        for(int i = 0; i< texto.length(); i++){
            aux.add(texto.charAt(i));
        }

        for(int i = 0; i< texto.length(); i++){
            char c = texto.charAt(i);
            if(c != aux.poll()){
                return false;
            }

        }

        
        return true;
    }

}
