/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.nio.file.NotDirectoryException;
import java.nio.file.Paths;
import java.nio.file.Files;
/**
 *
 * @author L&J
 */
public class NotDirectoryExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar NotDirectoryException
            Files.createDirectory(Paths.get("archivo.txt"));
        } catch (NotDirectoryException e) {
            System.err.println("No es un directorio: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    } 
}
