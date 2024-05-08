/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.util.*;

public class MissingResourceExceptionEj {
     public static void main(String[] args) {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("NonExistentBundle"); // Intenta cargar un archivo de recursos que no existe
            String value = bundle.getString("key");
            System.out.println("Valor: " + value);
        } catch (MissingResourceException e) {
            System.out.println("Error: Recurso no encontrado.");
        }
    }
}
