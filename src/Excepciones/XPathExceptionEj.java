/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import javax.xml.xpath.XPathException;
/**
 *
 * @author L&J
 */
public class XPathExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar XPathException
            throw new XPathException("Error en la expresión XPath");
        } catch (XPathException e) {
            System.err.println("Error en la expresión XPath: " + e.getMessage());
        }
    }  
}
