/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class NegativeArraySizeExceptionEj {
     public static void main(String[] args) {
        try {
            int[] array = new int[-5]; // Intenta crear un arreglo con un tamaño negativo
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Tamaño de arreglo negativo.");
        }
    }
}