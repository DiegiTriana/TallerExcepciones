/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class EnumConstantNotPresentExceptionEj {
  public enum ExampleEnum {
        VALUE1, VALUE2
    }

    public static void main(String[] args) {
        try {
            ExampleEnum.valueOf("VALUE3"); // Intenta acceder a una constante de enumeración que no existe
        } catch (EnumConstantNotPresentException e) {
            System.out.println("Error: Constante de enumeración no presente.");
        }
    }
}
