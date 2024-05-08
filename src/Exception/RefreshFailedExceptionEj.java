/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.nio.file.attribute.UserPrincipalLookupService;
import javax.security.auth.RefreshFailedException;

/**
 *
 * @author L&J
 */
public class RefreshFailedExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar RefreshFailedException
            throw new RefreshFailedException("Fallo al actualizar");
        } catch (RefreshFailedException e) {
            System.err.println("Fallo al actualizar: " + e.getMessage());
        }
    }
}
