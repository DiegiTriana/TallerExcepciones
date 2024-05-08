/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.io.*;
import java.nio.channels.*;

public class NonReadableChannelExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar NonReadableChannelException
            SocketChannel socketChannel = SocketChannel.open();
            throw new NonReadableChannelException();
        } catch (NonReadableChannelException e) {
            System.err.println("Canal no legible: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
