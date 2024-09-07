import java.util.ArrayList;
public class Tienda {
    private ArrayList<Cliente> clientes;

    public Tienda() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarCliente(int id){
        for (Cliente cliente : clientes ) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public boolean actualizarDatos(int id, String nombre, String correo, String telefono){
        Cliente cliente = buscarCliente(id);
        if (cliente != null){
            cliente.setNombre(nombre);
            cliente.setCorreo(correo);
            cliente.setTelefono(telefono);
            return true;
        }
        return false;
    }

    public boolean eliminarCliente(int id){
        Cliente cliente = buscarCliente(id);
        if (cliente != null){
            clientes.remove(cliente);
            return true;
        }
        return false;
    }

    public void mostrarDatos(){
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}