/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.io.*;
import java.nio.channels.*;

public class NonWritableChannelExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar NonWritableChannelException
            SocketChannel socketChannel = SocketChannel.open();
            throw new NonWritableChannelException();
        } catch (NonWritableChannelException e) {
            System.err.println("Canal no escribible: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
