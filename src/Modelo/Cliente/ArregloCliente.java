package Modelo.Cliente;

public class ArregloCliente {
    private int indice = 0;
    private Cliente[] clientes;
    public ArregloCliente(int size) {
        clientes = new Cliente[size];
    }
    public boolean agregar(Cliente cliente) {
        clientes[indice] = cliente;
        indice++;
        return true;
    }
    public Cliente buscar(String RUC) {
        for (int i = 0; i < indice; i++) {
            if (clientes[i].getRUC().equals(RUC)) {
                return clientes[i];
            }
        }
        return null;
    }
}
