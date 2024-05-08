/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.spec.SecretKeySpec;
/**
 *
 * @author L&J
 */
public class InvalidKeyExceptionEj {
  public static void main(String[] args) throws NoSuchAlgorithmException {
        try {
            Key secretKey = new SecretKeySpec("clave".getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            cipher.doFinal("datos".getBytes());
        } catch (InvalidKeyException e) {
            System.err.println("Clave inválida: " + e.getMessage());
        } catch (NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException | NoSuchAlgorithmException e) {
            System.err.println("Error de cifrado: " + e.getMessage());
        }
    }  
}
