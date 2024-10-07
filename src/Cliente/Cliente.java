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
    // Puede tener 0 o 1 contacto
    private Contacto contacto;
    private String clave;
    // Cliente.Cliente posee 0 o mas ofertas
    private ArrayList<Oferta> ofertas = new ArrayList<>();
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
    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Contacto getContacto() {
        return contacto;
    }
    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
}
