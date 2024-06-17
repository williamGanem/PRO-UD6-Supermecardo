package net.supermercado.cajeros;

import java.util.LinkedList;
import java.util.Queue;
import net.supermercado.clientes.Clientes;

public class Cajeros {
    private int numeroCaja;
    private Queue<Clientes> colaClientes;

    public Cajeros(int numeroCaja) {
        this.numeroCaja = numeroCaja;
        this.colaClientes = new LinkedList<>();
    }

    public void agregarCliente(Clientes cliente) {
        colaClientes.offer(cliente);
    }

    public Clientes atenderCliente() {
        return colaClientes.poll();
    }

    public int getTotalClientes() {
        return colaClientes.size();
    }

    public Queue<Clientes> getColaClientes() {
        return colaClientes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cajero\n");
        stringBuilder.append("===================================\n");
        stringBuilder.append("* Número de caja: ").append(numeroCaja).append("\n");
        stringBuilder.append("* Total de clientes: ").append(getTotalClientes()).append("\n");
        stringBuilder.append("* Clientes en la fila:\n");

        for (Clientes cliente : colaClientes) {
            stringBuilder.append(cliente.getNombre()).append("\n");
        }

        stringBuilder.append("===================================\n");
        return stringBuilder.toString();
    }
}
