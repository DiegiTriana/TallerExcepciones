/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.xml.crypto.MarshalException;

/**
 *
 * @author L&J
 */
public class MarshalExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar MarshalException
            throw new MarshalException("Error de marshalling");
        } catch (MarshalException e) {
            System.err.println("Error de marshalling: " + e.getMessage());
        }
    } 
}
