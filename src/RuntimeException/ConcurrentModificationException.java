/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.util.ArrayList;
import java.util.List;

class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Agregamos algunos números a la lista
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Iteramos sobre la lista y tratamos de modificarla durante la iteración
        try {
            for (Integer number : numbers) {
                System.out.println(number);
                // Intentamos agregar un elemento a la lista durante la iteración
                numbers.add(4); // Esto lanzará ConcurrentModificationException
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
