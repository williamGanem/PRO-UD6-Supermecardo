package net.supermercado.utilidades;

import java.util.Random;

public class Utilidades {
    private static final String[] PRODUCTOS = {
            "Leche", "Pan", "Huevos", "Cereal", "Frutas", "Vegetales", "Carne", "Pescado", "Queso", "Yogur", "Café",
            "Té"
    };

    private static final String[] NOMBRES = {
            "Juan", "María", "Pedro", "Ana", "Luis", "Carmen", "Jorge", "Laura", "Carlos", "Marta",
            "José", "Elena", "Pablo", "Sara", "Diego", "Paula", "Andrés", "Isabel", "Raúl", "Lucía"
    };

    public static String obtenerProductoAleatorio() {
        Random random = new Random();
        int index = random.nextInt(PRODUCTOS.length);
        return PRODUCTOS[index];
    }

    public static String obtenerNombreAleatorio() {
        Random random = new Random();
        int index = random.nextInt(NOMBRES.length);
        return NOMBRES[index];
    }

}
