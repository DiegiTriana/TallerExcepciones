/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import org.ietf.jgss.GSSException;

public class GSSExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar GSSException
            throw new GSSException(GSSException.FAILURE);
        } catch (GSSException e) {
            System.err.println("Se ha producido un error GSS: " + e.getMessage());
        }
    }   
}
