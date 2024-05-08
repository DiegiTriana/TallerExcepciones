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
public class XMLStreamExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar XMLStreamException
            throw new XMLStreamException("Error en la secuencia XML");
        } catch (XMLStreamException e) {
            System.err.println("Error en la secuencia XML: " + e.getMessage());
        }
    }  
}
