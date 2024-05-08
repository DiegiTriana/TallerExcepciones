/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownServiceException;

public class UnknownServiceExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar UnknownServiceException
            URL url = new URL("http://www.example.com");
            URLConnection connection = url.openConnection();
            connection.connect(); // Intentar conectar a un servicio desconocido
        } catch (UnknownServiceException e) {
            System.err.println("Servicio desconocido: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
