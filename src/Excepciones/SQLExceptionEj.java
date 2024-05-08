/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author L&J
 */
public class SQLExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar SQLException
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "usuario", "contraseña");
        } catch (SQLException e) {
            System.err.println("Error de SQL: " + e.getMessage());
        }
    } 
}
