/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import com.sun.tools.javac.Main;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
    String description() default ""; // Debería estar anotado, de lo contrario, lanzará IncompleteAnnotationException
}

public class IncompleteAnnotationExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IncompleteAnnotationException
            MyAnnotation annotation = Main.class.getAnnotation(MyAnnotation.class);
        } catch (IncompleteAnnotationException e) {
            System.err.println("Anotación incompleta: " + e.getMessage());
        }
    }
}


