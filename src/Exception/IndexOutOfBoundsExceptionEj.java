/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundsExceptionEj {
    public static void main(String[] args) {
        try {
            String str = "Java";
            char ch = str.charAt(10); // Intenta acceder a un índice que está fuera del rango de la cadena
            System.out.println("Carácter: " + ch);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites.");
        }
    }
}