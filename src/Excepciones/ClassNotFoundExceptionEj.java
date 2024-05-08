/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;


public class ClassNotFoundExceptionEj {
public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass"); // Intenta cargar una clase que no existe
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Clase no encontrada.");
        }
    }
}
