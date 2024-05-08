/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;


public class ArrayIndexOutOfBoundsExceptionEj {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            int element = array[3]; // Intenta acceder a un índice fuera de los límites del arreglo
            System.out.println("Elemento: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del arreglo.");
        }
    }  
}
