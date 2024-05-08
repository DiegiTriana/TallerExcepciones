
package Exception;


public class ClassCastExceptionEj {
    public static void main(String[] args) {
        try {
            Object obj = "Java";
            Integer num = (Integer) obj; // Intenta convertir un objeto a un tipo incompatible
            System.out.println("Número: " + num);
        } catch (ClassCastException e) {
            System.out.println("Error: Conversión de tipos no válida.");
        }
    }
}