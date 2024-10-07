package Cliente;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Oferta.Oferta;
import Contacto.Contacto;

public class Cliente {
    private String RUC;
    private String nombre;
    private String email;
    private String telefono;
    private String clave;
    // Cliente.Cliente posee 0 o mas ofertas
    private ArrayList<Oferta> ofertas = new ArrayList<>();
    private Contacto[] contactos;
    public boolean agregarOferta(Oferta oferta) {
        ofertas.add(oferta);
        return true;
    }
    public boolean eliminarOferta(Oferta oferta) {
        ofertas.remove(oferta);
        return true;
    }
    public Oferta[] getOfertas() {
        return ofertas.toArray(new Oferta[ofertas.size()]);
    }
    public boolean registrarContacto(String DNI, String nombres, String apellidos, String puesto) {
        Contacto contacto = new Contacto(DNI, nombres, apellidos, puesto);
        return true;
    }

    public String getRUC() {
        return RUC;
    }
}
