/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.rmi.server.ServerNotActiveException;

/**
 *
 * @author L&J
 */
public class ServerNotActiveExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar ServerNotActiveException
            throw new ServerNotActiveException("El servidor no está activo");
        } catch (ServerNotActiveException e) {
            System.err.println("El servidor no está activo: " + e.getMessage());
        }
    }
}
