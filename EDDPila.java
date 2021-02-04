
package eddpila2;

public class EDDPILA {

    
    public static void main(String[] args) {
        PilaEstatica pe = new PilaEstatica(4);
        System.out.println("La pila es vacia?"+pe.esVacio());
        pe.push(2);
        pe.push(5);
        pe.push(20);
        pe.push(4);
        System.out.println("La pila es vacia?"+pe.esVacio());
        pe.pop();
        pe.mostrarTope();
    }
    
}
