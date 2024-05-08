/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;


public class ExceptionEj {
     public static void main(String[] args) {
        try {
            int result = 10 / 0; // Intenta realizar una división por cero
            System.out.println("Resultado: " + result);
        } catch (Exception e) {
            System.out.println("Error: Excepción general.");
        }
    }
}
