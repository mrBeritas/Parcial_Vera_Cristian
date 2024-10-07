public class ArregloGradoEstudio {
    private int indice = 0;
    private GradoEstudio[] gradosEstudio;
    public boolean agregar() {
        gradosEstudio[indice] = new GradoEstudio();
        indice++;
        return true;
    }
    public boolean buscar(String criterio) {
        for (int i = 0; i < indice; i++) {
            if (gradosEstudio[i].Descripcion.equals(criterio)) {
                return true;
            }
        }
        return false;
    }

    public GradoEstudio[] getGradosEstudio() {
        return gradosEstudio;
    }
}