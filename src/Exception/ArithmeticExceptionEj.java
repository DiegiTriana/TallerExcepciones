/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class ArithmeticExceptionEj {
   public static void main(String[] args) {
        try {
            int result = 10 / 0; // Intenta dividir por cero
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
    }
}
