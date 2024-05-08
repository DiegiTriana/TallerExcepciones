/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.nio.file.FileSystemAlreadyExistsException; // Importamos la clase FileSystemAlreadyExistsException del paquete java.nio.file

public class FileSystemAlreadyExistsException1 {
    public static void main(String[] args) {
        try {
            // Simulamos un escenario donde se lanza la excepción FileSystemAlreadyExistsException
            throw new FileSystemAlreadyExistsException("Error: El sistema de archivos ya existe.");
        } catch (FileSystemAlreadyExistsException e) {
            // Manejamos la excepción
            System.out.println("Error: " + e.getMessage());
        }
    }
}