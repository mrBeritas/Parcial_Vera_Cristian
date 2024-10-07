package Modelo.Rubro;

import Modelo.Cliente.Cliente;

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
