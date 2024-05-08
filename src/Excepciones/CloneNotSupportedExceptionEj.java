/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;


public class CloneNotSupportedExceptionEj {
  public static void main(String[] args) {
        try {
            MyClass obj = new MyClass();
            MyClass clonedObj = (MyClass) obj.clone(); // Intenta clonar un objeto de la clase MyClass
            System.out.println("Cloned Object: " + clonedObj);
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: Clonación no soportada.");
        }
    }
}

class MyClass implements Cloneable {
    // Sobrescribe el método clone() de manera pública
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

