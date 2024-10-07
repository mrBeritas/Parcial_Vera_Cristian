package Postulante;

import GradoEstudio.GradoEstudio;
import GradoEstudio.ArregloGradoEstudio;
import Oferta.Oferta;
import Postulacion.Postulacion;

import java.util.Date;

public class Postulante {
    private String DNI;
    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private ArregloGradoEstudio gradosEstudio;
    private Date nacimiento;
    private String clave;


    public boolean asignarGradoEstudio(GradoEstudio grado) {
        gradosEstudio.agregar();
        return true;
    }
    public boolean postular(Oferta oferta, String glosa) {
        Postulacion postulacion = new Postulacion(oferta, glosa);
        return true;
    }
}
