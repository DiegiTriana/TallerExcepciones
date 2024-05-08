/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.io.IOException;

public class AbsentInformationExceptionEj {
   public static void main(String[] args) {
        try {
            // Intentamos crear un registro de archivo
            Logger logger = Logger.getLogger("MyLog");
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
        } catch (IOException e) {
            System.err.println("Se produjo un error al crear el archivo de registro: " + e.getMessage());
        }
    }
}
