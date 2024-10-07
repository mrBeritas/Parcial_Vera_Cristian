import Cliente.ArregloCliente;
import Cliente.Cliente;
public class App {
    public static void main(String[] args) {
        ArregloCliente arregloCliente = new ArregloCliente(10);
        Cliente cliente = new Cliente();
        cliente.setRUC("123456789");
        cliente.setEmail("ejemplo@gmail.com");
        cliente.setNombre("Ejemplo");
        cliente.setTelefono("123456789");
        arregloCliente.agregar(cliente);

        Cliente clienteEncontrado = arregloCliente.buscar("123456789");
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado: " + clienteEncontrado.getNombre());
        } else {
            System.out.println("Cliente no encontrado");
        }
    }
}