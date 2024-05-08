/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.io.NotSerializableException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class NotSerializableExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar NotSerializableException
            FileOutputStream fileOutputStream = new FileOutputStream("archivo.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(new Object()); // Intentar serializar un objeto no serializable
        } catch (NotSerializableException e) {
            System.err.println("Objeto no serializable: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }
  }
