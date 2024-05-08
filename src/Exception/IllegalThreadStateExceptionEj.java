/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class IllegalThreadStateExceptionEj {
     public static void main(String[] args) {
        try {
            Thread thread = new Thread();
            thread.start();
            thread.start(); // Intenta iniciar un hilo que ya se ha iniciado
        } catch (IllegalThreadStateException e) {
            System.out.println("Error: Estado ilegal del hilo.");
        }
    }
}
