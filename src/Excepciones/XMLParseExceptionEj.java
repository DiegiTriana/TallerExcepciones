/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.xml.stream.XMLStreamException;

/**
 *
 * @author L&J
 */
public class XMLParseExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar XMLStreamException
            throw new XMLStreamException("Error de análisis XML");
        } catch (XMLStreamException e) {
            System.err.println("Error de análisis XML: " + e.getMessage());
        }
    } 
}
