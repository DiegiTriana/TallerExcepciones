/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class FileNotFoundExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar FileNotFoundException
            FileInputStream file = new FileInputStream("archivo.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }
}