/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class IllegalStateExceptionEj {
    public static void main (String [] args){
    try {
            StringBuilder sb = new StringBuilder();
            sb.append("Hello");
            sb.setLength(-1); // Intenta establecer una longitud negativa en un StringBuilder
        } catch (IllegalStateException e) {
            System.out.println("Error: Estado ilegal.");
        }
}
}