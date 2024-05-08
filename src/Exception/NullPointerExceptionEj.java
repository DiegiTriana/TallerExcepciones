/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class NullPointerExceptionEj {
      public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); // Intenta acceder a un método o campo de un objeto nulo
            System.out.println("Longitud de la cadena: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: Referencia nula.");
        }
    }

}
