import java.util.ArrayList;

public class ArregloRubro {
    private int indice;
    ArrayList<Rubro> rubros = new ArrayList<Rubro>();
    private boolean agregar() {
        this.indice++;
        return true;
    }
    public boolean buscar(String nombre) {
        for (Rubro rubro : rubros) {
            if (rubro.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
}