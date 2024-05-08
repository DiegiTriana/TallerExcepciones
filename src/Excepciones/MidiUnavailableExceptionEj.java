/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.sound.midi.MidiUnavailableException;

/**
 *
 * @author L&J
 */
public class MidiUnavailableExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar MidiUnavailableException
            throw new MidiUnavailableException("MIDI no disponible");
        } catch (MidiUnavailableException e) {
            System.err.println("MIDI no disponible: " + e.getMessage());
        }
    } 
}
