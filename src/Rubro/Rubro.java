package Rubro;

import Cliente.Cliente;
import java.util.ArrayList;

public class Rubro {
    private String nombre;
    private boolean estado;

    public boolean habilitar() {
        this.estado = true;
        return this.estado;
    }
    public boolean deshabilitar() {
        this.estado = false;
        return this.estado;
    }
    public String getNombre() {
        return this.nombre;
    }
    private Cliente[] clientes;
}