/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.xml.parsers.ParserConfigurationException;

/**
 *
 * @author L&J
 */
public class ParserConfigurationExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar ParserConfigurationException
            throw new ParserConfigurationException("Error de configuración del analizador");
        } catch (ParserConfigurationException e) {
            System.err.println("Error de configuración del analizador: " + e.getMessage());
        }
    }  
}
