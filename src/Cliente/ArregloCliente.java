package Cliente;

import Cliente.Cliente;

public class ArregloCliente {
    private int indice = 0;
    private Cliente[] clientes;
    public boolean agregar() {
        clientes[indice] = new Cliente();
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
