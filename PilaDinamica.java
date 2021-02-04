
package eddpila;

import java.util.Stack;


public class PilaDinamica {

    public static void main(String[] args) {
        Stack pilita = new Stack();
        /*apilar elementos*/
        pilita.push(30);
        pilita.push(10);
        pilita.push(60);
        pilita.push(80);
        pilita.push(100);
        pilita.push(4);
        
        System.out.println("La cima de la pila es: "
                +pilita.peek());
        System.out.println("Extrayendo el elemento de la cima: "
                +pilita.pop());
        System.out.println("------------");
        System.out.println("La cima de la pila es: "
                +pilita.peek());
        System.out.println("La pila esta vacia? "+pilita.isEmpty());
    
        System.out.println("---------------");
        System.out.println("Busqueda de elemento");
        
        int buscar = 60;
        int i=pilita.size();
        while(i>=1){
            if(pilita.pop().equals(buscar)){
                System.out.println("Elemento encontrado");
            }
            i--;
        }
    }
    
}
