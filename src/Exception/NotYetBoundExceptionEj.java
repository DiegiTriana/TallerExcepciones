/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.nio.channels.NotYetBoundException;
import java.nio.channels.ServerSocketChannel;
/**
 *
 * @author L&J
 */
public class NotYetBoundExceptionEj {
     public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar NotYetBoundException
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.getLocalAddress(); // Intentar obtener la dirección local antes de enlazar el canal
        } catch (NotYetBoundException e) {
            System.err.println("Canal no enlazado todavía: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
