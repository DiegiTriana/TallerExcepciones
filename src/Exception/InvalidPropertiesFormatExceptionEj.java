/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author L&J
 */
public class InvalidPropertiesFormatExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar InvalidPropertiesFormatException
            Properties properties = new Properties();
            properties.loadFromXML(new FileInputStream("archivo.xml")); // Intentar cargar un archivo XML incorrecto
        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    } 
}
