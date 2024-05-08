/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ParseExceptionEj {
  public static void main(String[] args) {
        try {
            String dateStr = "2022-13-01";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.parse(dateStr); // Intenta analizar una cadena con un formato de fecha inválido
        } catch (ParseException e) {
            System.out.println("Error: Fecha no analizable.");
        }
    }  
}
