/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
/**
 *
 * @author L&J
 */
public class EOFExceptionEj {
     public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar EOFException
            DataInputStream inputStream = new DataInputStream(System.in);
            inputStream.readUTF();
        } catch (EOFException e) {
            System.err.println("Fin de archivo alcanzado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
