/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.util.Collections;
import java.util.List;

public class UnsupportedOperationExceptionEj {
   public static void main(String[] args) {
        try {
            List<String> list = Collections.emptyList();
            list.add("Java"); // Intenta realizar una operación no compatible en una lista de solo lectura
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: Operación no soportada.");
        }
    }
}
