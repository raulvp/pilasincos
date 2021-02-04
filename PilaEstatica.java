
package eddpila2;
public class PilaEstatica {
    
    int tamanio[];
    int cima;
    
    public PilaEstatica(int datos){
        tamanio = new int[datos];
        cima=-1;
    }
    //push, insertar el valor en la cima
    public void push(int valor){
        cima++;
        tamanio[cima]=valor;
        System.out.println("Valor ingresado: "+valor);
    }
    //pop, extraer el ultimo dato ingresado
    public void pop(){
        int aux = tamanio[cima];
        cima--;
        System.out.println("Dato extraido: "+aux);
    }
    public boolean esVacio(){
        if(cima<0){
            return true;
        }else return false;
    }
    public void mostrarTope(){
    
        System.out.println(""+tamanio[cima]);
    }  
}
