/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class IllegalAccessExceptionEj {
      public static void main(String[] args) {
        try {
            Class<?> clazz = Exception.IllegalAccessExceptionEj.class;
            clazz.getDeclaredMethod("privateMethod").invoke(clazz.newInstance()); // Intenta acceder a un método privado de la clase
        } catch (Exception e) {
            System.out.println("Error: Acceso ilegal.");
        }
    }

    private void privateMethod() {
        System.out.println("Método privado invocado.");
    }
}
