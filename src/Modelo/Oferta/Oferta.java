package Modelo.Oferta;

import java.util.ArrayList;
import java.util.Date;

import Modelo.Requisito.Requisito;
import Modelo.Postulacion.Postulacion;

public class Oferta {
    private String puesto;
    private String descripcion;
    private String area;
    private Date fechaInicio;
    private Date fechaFin;

    // Posee 0 o mas requisitos
    private ArrayList<Requisito> requisitos = new ArrayList<Requisito>();
    // Posee 0 o mas postulaciones
    private Postulacion[] postulaciones;

    public boolean agregarRequisito(int orden, String descripcion) {
        Requisito requisito = new Requisito(orden, descripcion);
        requisitos.add(requisito);
        return true;
    }
    public Requisito[] getRequisitos() {
        return requisitos.toArray(new Requisito[requisitos.size()]);
    }
    public boolean eliminarRequisito(int orden) {
        for (Requisito requisito : requisitos) {
            if (requisito.getOrden() == orden) {
                requisitos.remove(requisito);
                return true;
            }
        }
        return false;
    }
}