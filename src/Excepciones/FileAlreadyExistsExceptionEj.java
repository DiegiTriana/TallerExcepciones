/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author L&J
 */
public class FileAlreadyExistsExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar FileAlreadyExistsException
            Files.createFile(Paths.get("archivo.txt"));
            Files.createFile(Paths.get("archivo.txt")); // Intentar crear el mismo archivo
        } catch (FileAlreadyExistsException e) {
            System.err.println("El archivo ya existe: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }  
}
