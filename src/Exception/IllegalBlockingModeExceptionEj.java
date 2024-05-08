/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.nio.channels.FileChannel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileLock;
import java.nio.channels.IllegalBlockingModeException;
/**
 *
 * @author L&J
 */
public class IllegalBlockingModeExceptionEj {
   public static void main(String[] args) {
        try (FileChannel inChannel = new FileInputStream("entrada.txt").getChannel();
             FileChannel outChannel = new FileOutputStream("salida.txt").getChannel()) {
            
            FileLock lock = inChannel.lock(); // Bloqueo del canal de entrada
            
            // Lectura y escritura de datos
            
            lock.release(); // Liberar el bloqueo
        } catch (IllegalBlockingModeException e) {
            System.err.println("Modo de bloqueo ilegal: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ocurrió un error de E/S: " + e.getMessage());
        }
    }  
}
