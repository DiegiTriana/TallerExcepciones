/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.net.URISyntaxException;

/**
 *
 * @author L&J
 */
public class URISyntaxExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar URISyntaxException
            throw new URISyntaxException("URI no válida", "Detalles del error");
        } catch (URISyntaxException e) {
            System.err.println("URI no válida: " + e.getMessage());
        }
    }  
}
