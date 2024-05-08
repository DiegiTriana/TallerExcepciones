/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author L&J
 */
public class ThreadDeathEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar ThreadDeath
            throw new ThreadDeath();
        } catch (ThreadDeath e) {
            System.err.println("Hilo terminado abruptamente: " + e.getMessage());
        }
    }  
}
