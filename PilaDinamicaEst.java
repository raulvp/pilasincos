
package eddpila1;

import java.util.Stack;


public class PilaDinamicaEst {

    
    public static void main(String[] args) {
        Stack pila = new Stack(); //crear un pila vacia
        System.out.println("La pila esta vacia? "+
                pila.isEmpty());
        
        
        Stack estudiante = new Stack();
        Estudiante est1 = new Estudiante("Alicia", "Rojas", "sis-001", "sis inf");
        Estudiante est2 = new Estudiante("Alvaro", "Perez", "sis-002", "sis inf");
        Estudiante est3 = new Estudiante("Ana", "Campero", "cont-001", "contaduria");
    
        estudiante.push(est1);
        estudiante.push(est2);
        estudiante.push(est3);
        
        System.out.println("El ultimo estudiante inscrito: "+
                estudiante.peek().toString());
    }
    
}
 
