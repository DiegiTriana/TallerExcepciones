/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.nio.file.*;

public class NoSuchFileExceptionEj {
    
 public static void main(String[] args) {
        try {
            Path path = Paths.get("nonexistent.txt"); // Intenta acceder a un archivo que no existe
            byte[] data = Files.readAllBytes(path);
            System.out.println("Contenido: " + new String(data));
        } catch (NoSuchFileException e) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (Exception e) {
            System.out.println("Error: Excepción general.");
        }
    }
}
