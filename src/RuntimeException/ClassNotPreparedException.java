/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

class ClassNotPreparedException extends Exception {
    // Constructor con un mensaje personalizado
    public ClassNotPreparedException(String message) {
        super(message);
    }
}

class Classroom {
    private boolean prepared;

    public Classroom() {
        this.prepared = false;
    }

    public void prepareClassroom() {
        // Lógica para preparar el aula
        prepared = true;
        System.out.println("El aula está lista para la clase.");
    }

    public void conductClass() throws ClassNotPreparedException {
        if (!prepared) {
            throw new ClassNotPreparedException("El aula no está preparada para la clase.");
        }
        // Lógica para impartir la clase
        System.out.println("Impartiendo la clase.");
    }
}

class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        try {
            // Intentamos impartir la clase sin preparar el aula primero
            classroom.conductClass();
        } catch (ClassNotPreparedException e) {
            System.out.println("Error: " + e.getMessage());
            // Podríamos intentar preparar el aula aquí
            classroom.prepareClassroom();
            try {
                // Después de preparar el aula, intentamos impartir la clase nuevamente
                classroom.conductClass();
            } catch (ClassNotPreparedException ex) {
                // Manejo adicional si falla nuevamente
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}
