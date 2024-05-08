/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.nio.channels.FileChannel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;


public class OverlappingFileLockExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar OverlappingFileLockException
            FileOutputStream fos = new FileOutputStream("archivo.txt");
            FileChannel fileChannel = fos.getChannel();
            FileLock lock1 = fileChannel.lock(); // Primer bloqueo
            FileLock lock2 = fileChannel.lock(); // Intentar bloquear el mismo archivo nuevamente
        } catch (OverlappingFileLockException e) {
            System.err.println("Bloqueo de archivo superpuesto: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ocurrió un error de E/S: " + e.getMessage());
        }
    }
}
