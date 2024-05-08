/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.awt.FontFormatException;
/**
 *
 * @author L&J
 */
public class FontFormatExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar FontFormatException
            throw new FontFormatException("¡Error de formato de fuente!");
        } catch (FontFormatException e) {
            System.err.println("Se ha producido un error de formato de fuente: " + e.getMessage());
        }
    }
}
