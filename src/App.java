import java.util.Scanner;
import net.supermercado.Supermercado;

public class App {

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir un nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar supermercado");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    supermercado.abrirCaja();
                    break;
                case 2:
                    supermercado.agregarCliente();
                    break;
                case 3:
                    supermercado.atenderCliente();
                    break;
                case 4:
                    supermercado.verClientesPendientes();
                    break;
                case 5:
                    supermercado.cerrarSupermercado();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();

    }
}
