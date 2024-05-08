/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.rmi.*;
import java.rmi.registry.*;

public class AlreadyBoundExceptionEj {
  public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("service", new RemoteObject()); // Intenta vincular un objeto que ya está enlazado
            registry.bind("service", new RemoteObject());
        } catch (AlreadyBoundException e) {
            System.out.println("Error: Objeto ya vinculado.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class RemoteObject implements Remote {
    // Implementación de objeto remoto  
}
