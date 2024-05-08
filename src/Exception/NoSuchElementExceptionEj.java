/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.*;

/**
 *
 * @author L&J
 */
public class NoSuchElementExceptionEj {
 public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<>();
            Iterator<String> iterator = list.iterator();
            iterator.next(); // Intenta acceder al siguiente elemento cuando no hay más elementos en la colección
        } catch (NoSuchElementException e) {
            System.out.println("Error: Elemento no encontrado.");
        }
    }   
}
