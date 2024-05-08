/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import org.xml.sax.SAXException;

/**
 *
 * @author L&J
 */
public class SAXExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar SAXException
            throw new SAXException("Error de SAX");
        } catch (SAXException e) {
            System.err.println("Error de SAX: " + e.getMessage());
        }
    }   
}
