    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.net.URI;
import java.nio.file.*;

public class FileSystemNotFoundExceptionEj {
   public static void main(String[] args) {
        try {
            FileSystem fs = FileSystems.getFileSystem(URI.create("file://nonexistent")); // Intenta acceder a un sistema de archivos que no existe
        } catch (FileSystemNotFoundException e) {
            System.out.println("Error: El sistema de archivos no encontrado.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    } 
}
