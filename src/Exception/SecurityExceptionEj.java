/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class SecurityExceptionEj {
    public static void main(String[] args) {
        try {
            System.setSecurityManager(null); // Intenta establecer un administrador de seguridad en un entorno donde no se permite
        } catch (SecurityException e) {
            System.out.println("Error: Excepción de seguridad.");
        }
    }
}
