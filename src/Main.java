import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();

        while (true){
            System.out.println("1. Buscar cliente");
            System.out.println("2. Agregar cliente");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Actualicar cliente");
            System.out.println("5. Mostrar clientes");
            System.out.println("6. Salir");
            int accion = scanner.nextInt();

            switch (accion) {
                case 1:
                    System.out.println("Ingrese el ID del cliente: ");
                    int id = scanner.nextInt();
                    Cliente clienteID = tienda.buscarCliente(id);
                    if (clienteID != null) {
                        System.out.println(clienteID);
                    }else {
                        System.out.println("El cliente ingresado no existe");
                    }

                case 2:
                    System.out.print("Ingrese el ID del cliente: ");
                    int ID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el correo del cliente: ");
                    String correo = scanner.nextLine();
                    System.out.print("Ingrese eltelefono del cliente: ");
                    String telefono = scanner.nextLine();
                    Cliente cliente = new Cliente(ID, nombre, correo, telefono);
                    tienda.agregarCliente(cliente);
                    System.out.println("Cliente agregado");
                    break;

            }
        }

    }
}