/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.xml.transform.TransformerException;

/**
 *
 * @author L&J
 */
public class TransformerExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar TransformerException
            throw new TransformerException("Error de transformación");
        } catch (TransformerException e) {
            System.err.println("Error de transformación: " + e.getMessage());
        }
    }
}
