/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.xml.crypto.URIReferenceException;

/**
 *
 * @author L&J
 */
public class URIReferenceExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar URIReferenceException
            throw new URIReferenceException("Referencia de URI no válida");
        } catch (URIReferenceException e) {
            System.err.println("Referencia de URI no válida: " + e.getMessage());
        }
    }  
}
