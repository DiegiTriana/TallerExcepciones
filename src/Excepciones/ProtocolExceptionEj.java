/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.net.*;

public class ProtocolExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar ProtocolException
            throw new ProtocolException("Error en el protocolo de red");
        } catch (ProtocolException e) {
            System.err.println("Excepción de protocolo: " + e.getMessage());
        }
    }
}
