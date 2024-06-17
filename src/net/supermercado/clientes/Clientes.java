package net.supermercado.clientes;

import java.util.Stack;

public class Clientes {
    private String nombre;
    private Stack<String> cesta;

    public Clientes(String nombre) {
        this.nombre = nombre;
        this.cesta = new Stack<>();
    }

    public void agregarProducto(String producto) {
        cesta.push(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public int getTotalProductos() {
        return cesta.size();
    }

    public Stack<String> getCesta() {
        return cesta;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cliente\n");
        stringBuilder.append("===================================\n");
        stringBuilder.append("* Nombre: ").append(nombre).append("\n");
        stringBuilder.append("* Total de productos: ").append(getTotalProductos()).append("\n");
        stringBuilder.append("* Lista de artículos en la cesta:\n");

        for (String producto : cesta) {
            stringBuilder.append(producto).append("\n");
        }

        stringBuilder.append("===================================\n");
        return stringBuilder.toString();
    }
}
