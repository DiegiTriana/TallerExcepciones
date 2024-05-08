/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class InstantiationExceptionEj {
  public static void main(String[] args) {
        try {
            Class<?> clazz = Integer.class;
            Object obj = clazz.newInstance(); // Intenta crear una instancia de una clase abstracta o de una interfaz
            System.out.println("Objeto: " + obj);
        } catch (InstantiationException e) {
            System.out.println("Error: Instanciación no válida.");
        } catch (IllegalAccessException e) {
            System.out.println("Error: Acceso ilegal.");
        }
    }
}
