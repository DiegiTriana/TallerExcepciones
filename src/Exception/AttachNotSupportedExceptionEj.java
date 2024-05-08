/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

public class AttachNotSupportedExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar AttachNotSupportedException
            throw new Exception("¡Error de soporte de adjunto!");
        } catch (Exception e) {
            System.err.println("Se ha producido un error de soporte de adjunto: " + e.getMessage());
        }
    }
}
