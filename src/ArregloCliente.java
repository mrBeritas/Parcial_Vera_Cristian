import java.util.ArrayList;

public class ArregloCliente {
    private int indice;
    private Cliente[] clientes;
    public boolean agregar() {
        // Agregar un cliente
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
