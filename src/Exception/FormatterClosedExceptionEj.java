/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Locale;

public class FormatterClosedExceptionEj {
   public static void main(String[] args) {
        try (Formatter formatter = new Formatter()) {
            formatter.format(Locale.getDefault(), "Hello, World!");
            formatter.close();
            formatter.format(Locale.getDefault(), "This will throw FormatterClosedException"); // Intentar formatear después de cerrar el Formatter
        } catch (FormatterClosedException e) {
            System.err.println("Formatter cerrado: " + e.getMessage());
        }
    }
}