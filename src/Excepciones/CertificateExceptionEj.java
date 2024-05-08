/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.security.cert.CertificateException;


public class CertificateExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar la excepción respectiva
            throw new CertificateException("¡Error de certificado!");
        } catch (CertificateException e) {
            System.err.println("Se ha producido un error de certificado: " + e.getMessage());
        }
    }
}
