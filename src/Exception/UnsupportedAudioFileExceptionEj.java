/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author L&J
 */
public class UnsupportedAudioFileExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar UnsupportedAudioFileException
            throw new UnsupportedAudioFileException("Archivo de audio no compatible");
        } catch (UnsupportedAudioFileException e) {
            System.err.println("Archivo de audio no compatible: " + e.getMessage());
        }
    }   
}
