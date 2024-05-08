/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.awt.datatransfer.MimeTypeParseException;

/**
 *
 * @author L&J
 */
public class MimeTypeParseExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar MimeTypeParseException
            throw new MimeTypeParseException("Error al analizar el tipo MIME");
        } catch (MimeTypeParseException e) {
            System.err.println("Error al analizar el tipo MIME: " + e.getMessage());
        }
    }  
}
