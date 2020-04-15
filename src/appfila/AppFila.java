/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfila;

/**
 *
 * @author groov
 */
public class AppFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fila fila = new Fila();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
         
        while(!fila.isEmpty()){
        int x = fila.dequeue();
        System.out.println("Retirei o elemento: "+x);
        }
    }
    
}
