/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;


import org.w3c.dom.DOMException;

public class DOMException1 {
    public static void main(String[] args) {
        try {
            // Simulación de una operación que lanza una DOMException
            throwDOMException();
        } catch (DOMException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void throwDOMException() throws DOMException {
        // Simulación de una operación que lanza una DOMException
        throw new DOMException((short) 1, "Error en el modelo de objeto de documento (DOM)");
    }
}