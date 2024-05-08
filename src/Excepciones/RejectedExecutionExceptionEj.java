/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.RejectedExecutionException;
/**
 *
 * @author L&J
 */
public class RejectedExecutionExceptionEj {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
            executor.shutdown();
            executor.execute(() -> System.out.println("Tarea ejecutada")); // Intentar ejecutar una tarea en un executor apagado
        } catch (RejectedExecutionException e) {
            System.err.println("Tarea rechazada: " + e.getMessage());
        }
    }
}
