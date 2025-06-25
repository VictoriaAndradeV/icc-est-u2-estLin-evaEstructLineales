package main;
import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
      

        //primer ejercicio
        LogicaClasificacion logicaClasificacion = new LogicaClasificacion();
        Queue<String> cola = new LinkedList<String>();

        cola.add("Ana");
        cola.add("Luis");
        cola.add("Pablo");

        System.out.println("La cola invertida es: " +logicaClasificacion.invertirColaNombres(cola) );

        //segundo ejercicio
        //Queue<String> cola2 = new LinkedList<String>();
        //cola.add("anilina");

        String texto = "anilina";
        boolean palindromo = logicaClasificacion.verificarPalindromoCola(texto);

        if(boolean == false){
            System.out.println("No es un palindromo");
        }




    }
}
