/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import com.sun.tools.javac.Main;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 *
 * @author L&J
 */
public class InvocationTargetExceptionEj {
   public static void main(String[] args) {
        try {
            Method method = Main.class.getMethod("métodoIncorrecto");
            method.invoke(new Main()); // Intentar invocar un método incorrecto
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.err.println("Error de invocación: " + e.getMessage());
        }
    }  
}
