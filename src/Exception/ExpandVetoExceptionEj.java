/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.beans.PropertyVetoException;
/**
 *
 * @author L&J
 */
public class ExpandVetoExceptionEj {
     public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar ExpandVetoException
            throw new PropertyVetoException("¡Error de veto de expansión!", null);
        } catch (PropertyVetoException e) {
            System.err.println("Se ha producido un error de veto de expansión: " + e.getMessage());
        }
    }
}