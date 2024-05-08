/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import javax.xml.datatype.DatatypeConfigurationException;
/**
 *
 * @author L&J
 */
public class DatatypeConfigurationExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar la excepción respectiva
            throw new DatatypeConfigurationException("¡Error de configuración de tipo de datos!");
        } catch (DatatypeConfigurationException e) {
            System.err.println("Se ha producido un error de configuración de tipo de datos: " + e.getMessage());
        }
    } 
}
