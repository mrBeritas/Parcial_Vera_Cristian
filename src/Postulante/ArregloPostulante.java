package Postulante;

import Postulante.Postulante;

public class ArregloPostulante {
    private int indice = 0;
    private Postulante[] postulantes;

    public boolean agregar() {
        postulantes[indice] = new Postulante();
        indice++;
        return true;
    }
}