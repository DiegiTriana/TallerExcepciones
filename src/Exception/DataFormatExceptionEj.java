/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.util.zip.DataFormatException;

public class DataFormatExceptionEj {
public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar la excepción respectiva
            throw new DataFormatException("¡Error de formato de datos!");
        } catch (DataFormatException e) {
            System.err.println("Se ha producido un error de formato de datos: " + e.getMessage());
        }
    }
}