package Rubro;

import Rubro.Rubro;

import java.util.ArrayList;

public class ArregloRubro {
    private int indice = 0;
    private Rubro[] rubros;
    private boolean agregar() {
        this.rubros[this.indice] = new Rubro();
        this.indice++;
        return true;
    }
    public boolean buscar(String nombre) {
        for (Rubro rubro : rubros) {
            if (rubro.getNombre().equals(nombre)) {
                return true; // Encontro el rubro
            }
        }
        return false; // No encontro el rubro
    }
}