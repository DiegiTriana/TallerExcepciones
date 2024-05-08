/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.security.*;

public class ProviderExceptionEj {
   public static void main(String[] args) {
        try {
            Security.addProvider(new BadProvider()); // Intenta agregar un proveedor de seguridad inválido
        } catch (ProviderException e) {
            System.out.println("Error: Excepción del proveedor.");
        }
    }
}

class BadProvider extends Provider {
    public BadProvider() {
        super("BadProvider", 1.0, "Proveedor de seguridad defectuoso");
    }   
}
