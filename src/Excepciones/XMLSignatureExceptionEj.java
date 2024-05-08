/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.xml.crypto.dsig.XMLSignatureException;

/**
 *
 * @author L&J
 */
public class XMLSignatureExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar XMLSignatureException
            throw new XMLSignatureException("Error en la firma XML");
        } catch (XMLSignatureException e) {
            System.err.println("Error en la firma XML: " + e.getMessage());
        }
    }  
}
