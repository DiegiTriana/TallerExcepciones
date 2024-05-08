/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

public class ClassCastException {
    public static void main(String[] args) {
        // Crear un arreglo de objetos de tipo Object
        Object[] objects = new Object[3];

        // Asignar diferentes tipos de objetos a elementos del arreglo
        objects[0] = "Hola"; // String
        objects[1] = 123;    // Integer
        objects[2] = true;   // Boolean

        // Intentar convertir cada objeto a un tipo incompatible y capturar ClassCastException si ocurre
        try {
            for (Object obj : objects) {
                // Intentar convertir el objeto a un tipo incompatible (en este caso, Integer)
                Integer intValue = (Integer) obj; // Esto lanzará ClassCastException para "Hola" y "true"
                System.out.println("Valor entero: " + intValue);
            }
        } catch (java.lang.ClassCastException e) {
            System.out.println("Error de conversión de tipo: " + e.getMessage());
        }
    }
}
