/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.transaction.xa.XAException;

/**
 *
 * @author L&J
 */
public class XAExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar XAException
            throw new XAException("Error en la transacción distribuida");
        } catch (XAException e) {
            System.err.println("Error en la transacción distribuida: " + e.getMessage());
        }
    } 
}
