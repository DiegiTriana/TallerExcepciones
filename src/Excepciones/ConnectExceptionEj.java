/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.net.ConnectException;

/**
 *
 * @author L&J
 */
public class ConnectExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar ConnectException
            throw new ConnectException("No se pudo conectar al host remoto");
        } catch (ConnectException e) {
            System.err.println("No se pudo conectar al host remoto: " + e.getMessage());
        }
    }  
}
