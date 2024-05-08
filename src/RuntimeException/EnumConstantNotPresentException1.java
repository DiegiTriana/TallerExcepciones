/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

public class EnumConstantNotPresentException1{
    enum ExampleEnum {
        VALUE1, VALUE2
    }

    public static void main(String[] args) {
        ExampleEnum exampleValue = ExampleEnum.VALUE3; // Intentamos acceder a un valor que no existe

        try {
            // Simulamos un escenario donde se lanza la excepción EnumConstantNotPresentException
            throw new EnumConstantNotPresentException(ExampleEnum.class, exampleValue.toString());
        } catch (EnumConstantNotPresentException e) {
            // Manejamos la excepción
            System.out.println("Error: La constante enum '" + e.constantName() + "' no está presente en " + e.getEnumType());
        }
    }
}
