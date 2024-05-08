/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.lang.reflect.Method;


public class NoSuchMethodExceptionEj {
  public static void main(String[] args) {
        try {
            Class<?> clazz = String.class;
            Method method = clazz.getMethod("nonExistentMethod"); // Intenta acceder a un método que no existe
        } catch (NoSuchMethodException e) {
            System.out.println("Error: Método no encontrado.");
        }
    }
}
