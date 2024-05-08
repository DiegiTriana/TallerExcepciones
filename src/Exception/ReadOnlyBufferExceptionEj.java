/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/**
 *
 * @author L&J
 */
public class ReadOnlyBufferExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar ReadOnlyBufferException
            ByteBuffer buffer = ByteBuffer.allocate(10);
            buffer.flip();
            buffer.put((byte) 1); // Intentar escribir en un buffer de solo lectura
        } catch (ReadOnlyBufferException e) {
            System.err.println("Buffer de solo lectura: " + e.getMessage());
        }
    }
}
