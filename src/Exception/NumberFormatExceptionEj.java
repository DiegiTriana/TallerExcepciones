/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author L&J
 */
public class NumberFormatExceptionEj {
  public static void main(String[] args) {
        try {
            String str = "abc";
            int num = Integer.parseInt(str); // Intenta convertir una cadena no numérica a un número
            System.out.println("Número: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato de número no válido.");
        }
    }
}
