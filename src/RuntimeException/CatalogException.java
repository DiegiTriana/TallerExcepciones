/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

class CatalogException extends Exception {
    // Constructor con un mensaje personalizado
    public CatalogException(String message) {
        super(message);
    }
}

class Catalog {
    private String[] items;
    private int capacity;
    private int size;

    public Catalog(int capacity) {
        this.capacity = capacity;
        this.items = new String[capacity];
        this.size = 0;
    }

    public void addItem(String item) throws CatalogException {
        if (size >= capacity) {
            throw new CatalogException("El catálogo está lleno, no se pueden agregar más elementos");
        }
        items[size] = item;
        size++;
    }

    public void displayCatalog() {
        System.out.println("Catálogo:");
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog(3);

        try {
            catalog.addItem("Producto 1");
            catalog.addItem("Producto 2");
            catalog.addItem("Producto 3");
            // Intentamos agregar un cuarto elemento, lo que debería lanzar una CatalogException
            catalog.addItem("Producto 4");
        } catch (CatalogException e) {
            System.out.println("Error al agregar elemento al catálogo: " + e.getMessage());
        }

        catalog.displayCatalog();
    }
}

