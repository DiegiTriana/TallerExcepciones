/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author L&J
 */
public class ArrayStoreExceptionEj {
   public static void main(String[] args) {
        Object[] objectArray = new String[5];
        try {
            objectArray[0] = 10; // Intenta almacenar un valor incompatible en un arreglo de objetos
        } catch (ArrayStoreException e) {
            System.out.println("Error: Almacenamiento de tipo incorrecto en el arreglo.");
        }
    }  
}
