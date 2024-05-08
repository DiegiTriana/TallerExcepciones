/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.script.ScriptException;

/**
 *
 * @author L&J
 */
public class ScriptExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar ScriptException
            throw new ScriptException("Error de script");
        } catch (ScriptException e) {
            System.err.println("Error de script: " + e.getMessage());
        }
    } 
}
