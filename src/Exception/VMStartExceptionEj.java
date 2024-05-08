/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import com.sun.jdi.connect.VMStartException;

/**
 *
 * @author L&J
 */
public class VMStartExceptionEj {
     public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar VMStartException
            throw new VMStartException("Error al iniciar la máquina virtual", null);
        } catch (VMStartException e) {
            System.err.println("Error al iniciar la máquina virtual: " + e.getMessage());
        }
    } 
}
