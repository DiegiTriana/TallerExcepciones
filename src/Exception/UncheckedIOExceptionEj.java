/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.io.UncheckedIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UncheckedIOExceptionEj {
      public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IOException
            Files.readAllBytes(Paths.get("archivo.txt")); // Intentar leer un archivo inexistente
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
