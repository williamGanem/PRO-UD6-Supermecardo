package net.supermercado;

import net.supermercado.cajeros.Cajeros;
import net.supermercado.utilidades.Utilidades;
import net.supermercado.clientes.Clientes;

public class Supermercado {
    private Cajeros cajeros;
    private boolean cajaAbierta;

    public Supermercado() {
        this.cajeros = new Cajeros(1);
        this.cajaAbierta = false;
    }

    public void abrirCaja() {
        if (cajaAbierta) {
            System.out.println("La caja ya está abierta.");
        } else {
            cajaAbierta = true;
            System.out.println("La caja ha sido abierta correctamente.");
        }
    }

    public void agregarCliente() {
        if (!cajaAbierta) {
            System.out.println("La caja está cerrada. No se pueden añadir clientes.");
            return;
        }

        Clientes cliente = new Clientes(Utilidades.obtenerNombreAleatorio());
        int numProductos = (int) (Math.random() * 10) + 1;

        for (int i = 0; i < numProductos; i++) {
            cliente.agregarProducto(Utilidades.obtenerProductoAleatorio());
        }

        cajeros.agregarCliente(cliente);
        System.out.println("Cliente añadido a la cola:\n" + cliente);
    }

    public void atenderCliente() {
        if (!cajaAbierta) {
            System.out.println("La caja está cerrada.");
            return;
        }

        Clientes cliente = cajeros.atenderCliente();
        if (cliente == null) {
            System.out.println("No hay clientes en la cola.");
        } else {
            System.out.println("Atendiendo al cliente:\n" + cliente);
        }
    }

    public void verClientesPendientes() {
        System.out.println(cajeros);
    }

    public void cerrarSupermercado() {
        if (!cajaAbierta) {
            System.out.println("La caja ya está cerrada.");
        } else if (cajeros.getTotalClientes() > 0) {
            System.out.println("No se puede cerrar la caja. Hay clientes en la cola.");
        } else {
            cajaAbierta = false;
            System.out.println("La caja ha sido cerrada.");
        }
    }
}
