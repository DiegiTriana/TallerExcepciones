/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class InterruptedExceptionEj {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000); // Intenta pausar el hilo actual y puede ser interrumpido
        } catch (InterruptedException e) {
            System.out.println("Error: Hilo interrumpido.");
        }
    }  
}
