/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.lang.reflect.Field;

public class NoSuchFieldExceptionEj {
    private int field;

    public static void main(String[] args) {
        try {
            Class<?> clazz = NoSuchFieldExceptionEj.class;
            Field field = clazz.getDeclaredField("nonExistentField"); // Intenta acceder a un campo que no existe
        } catch (NoSuchFieldException e) {
            System.out.println("Error: Campo no encontrado.");
        }
    }
}