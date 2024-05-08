/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.security.GeneralSecurityException;
/**
 *
 * @author L&J
 */
public class GeneralSecurityExceptionEj {
public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar GeneralSecurityException
            throw new GeneralSecurityException("¡Error de seguridad general!");
        } catch (GeneralSecurityException e) {
            System.err.println("Se ha producido un error de seguridad general: " + e.getMessage());
        }
    }    
}
