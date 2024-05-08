/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.sound.midi.InvalidMidiDataException;

/**
 *
 * @author L&J
 */
public class InvalidMidiDataExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar InvalidMidiDataException
            throw new InvalidMidiDataException("Datos MIDI no válidos");
        } catch (InvalidMidiDataException e) {
            System.err.println("Datos MIDI no válidos: " + e.getMessage());
        }
    }
}
