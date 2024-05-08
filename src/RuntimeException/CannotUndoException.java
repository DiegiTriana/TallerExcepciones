/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

class CannotUndoException extends Exception {
    // Constructor con un mensaje personalizado
    public CannotUndoException(String message) {
        super(message);
    }
}

class Document {
    private String content;
    private boolean changesMade;

    public Document() {
        this.content = "";
        this.changesMade = false;
    }

    public void addText(String text) {
        this.content += text;
        this.changesMade = true;
    }

    public void undo() throws CannotUndoException {
        if (!changesMade) {
            throw new CannotUndoException("No se pueden deshacer cambios porque no se ha realizado ninguno");
        }
        // Lógica para deshacer los cambios (en este caso, simplemente borramos el contenido)
        this.content = "";
        this.changesMade = false;
    }

    public String getContent() {
        return this.content;
    }
}

class Main {
    public static void main(String[] args) {
        Document document = new Document();

        try {
            document.undo();
        } catch (CannotUndoException e) {
            System.out.println("Error al intentar deshacer: " + e.getMessage());
        }
    }
}