/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class IllegalMonitorStateExceptionEj {
  public static void main(String[] args) {
        Object obj = new Object();
        try {
            synchronized(obj) {
                obj.wait(); // Intenta llamar al método wait() sin poseer el bloqueo del monitor
            }
        } catch (java.lang.InterruptedException e) { // Usa la clase estándar java.lang.InterruptedException
            System.out.println("Error: El hilo fue interrumpido mientras esperaba.");
        }
    }
}
