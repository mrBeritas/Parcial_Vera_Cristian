package Modelo.Postulacion;

import Modelo.Etapa.Etapa;
import Modelo.Oferta.Oferta;

import java.util.Date;

public class Postulacion {
    private String glosa;
    private Oferta oferta;
    private Date fecha;
    private boolean anulado;
    public Postulacion(Oferta oferta, String glosa) {
        this.oferta = oferta;
        this.glosa = glosa;
        this.fecha = new Date();
        this.anulado = false;
    }
    private Date fechaAnulacion;
    // Posee de 0 a muchas etapas
    private Etapa[] etapas;
}
