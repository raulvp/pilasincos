package colasedd1;

import java.util.LinkedList;
import java.util.Queue;

public class ColasEDD1 {
   
    public static void main(String[] args) {
        Queue<Integer> colita = new LinkedList<Integer>(); //creando la cola
                System.out.println("El cliente a ser atendido: "
                +cliente.peek().getNombre()+" con ticket "
                +cliente.peek().getTicket());
        
        colita.add(1);        colita.add(2);
        colita.add(3);        colita.add(4);
        colita.add(5);        colita.add(6);
        colita.add(7);        colita.add(8);
        colita.add(9);        colita.add(10);
        
        System.out.println("El ticket a ser atendido: "
                +colita.peek());
        System.out.println("El tamaño de la cola: "
                +colita.size());
        System.out.println("Esta vacia la cola? "
                +colita.isEmpty());
        //desencolar
        colita.remove();
        System.out.println("El ticket a ser atendido: "
                +colita.peek());
        //recorrido
        while(!colita.isEmpty()){
            System.out.println("Atendiendo al ticket: "
                    +colita.remove());
        }         
    } 
}
