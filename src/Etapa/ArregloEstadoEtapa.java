package Etapa;

public class ArregloEstadoEtapa {
    private int indice = 0;
    private EstadoEtapa[] estadosEtapas;

    public boolean agregar() {
        estadosEtapas[indice] = new EstadoEtapa();
        indice++;
        return true;
    }
}
