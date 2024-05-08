/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.nio.channels.UnsupportedAddressTypeException;
/**
 *
 * @author L&J
 */
public class UnsupportedAddressTypeExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar UnsupportedAddressTypeException
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("localhost", 8080)); // Intentar conectar con un tipo de dirección no compatible
        } catch (UnsupportedAddressTypeException e) {
            System.err.println("Tipo de dirección no compatible: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    } 
}
