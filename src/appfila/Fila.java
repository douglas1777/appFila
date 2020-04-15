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
public class Fila {

    private int[] valores;
    private int inicio;
    private int fim;
    private int total;

    public Fila() {
        valores = new int[10];
        inicio = 0;
        fim = 0;
        total = 0;

    }

    public void enqueue(int elemento) {
        if(isFull()){
            throw new RuntimeException("Fila cheia!");
        }
        valores[fim]= elemento;
        fim = (fim +1) % valores.length;
        total++;
    }
    public int dequeue(){
       if(isEmpty()){
       throw new RuntimeException("Fila Vazia!");
       }
        int elemento = valores[inicio];
        inicio = (inicio +1)% valores.length;
        total --;
        return elemento;
    }
    public int size(){
        return fim + 1;
    }
    
     public boolean isEmpty(){
      return total == 0;
     }
     public boolean isFull(){
      return total == valores.length;
     }
    
}
