public class ListaDinamica implements TDA{
    private Nodo primerNodo;

    public ListaDinamica() {
        primerNodo = null;
    }

    public void inicializarLista() {
        primerNodo = null;
    }

    public void agregarElemento(Estudiante estudiante) {
        Nodo nuevoNodo = new Nodo(estudiante);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            Nodo ultimo = obtenerUltimoNodo();
            ultimo.setSiguiente(nuevoNodo);
        }
    }

    private Nodo obtenerUltimoNodo() {
        Nodo actual = primerNodo;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    public boolean haySiguiente() {
        return primerNodo != null;
    }

    public Estudiante siguiente() {
        Estudiante estudiante = primerNodo.getEstudiante();
        primerNodo = primerNodo.getSiguiente();
        return estudiante;
    }

    public void eliminarElemento(int codigo) {
        if (primerNodo == null) {
            return;
        }

        if (primerNodo.getEstudiante().getCodigo() == codigo) {
            primerNodo = primerNodo.getSiguiente();
            return;
        }

        Nodo actual = primerNodo;
        Nodo previo = null;

        while (actual != null && actual.getEstudiante().getCodigo() != codigo) {
            previo = actual;
            actual = actual.getSiguiente();
        }

        if (actual != null) {
            previo.setSiguiente(actual.getSiguiente());
        }
    }

    public void ordenarLista() {
        if (primerNodo == null || primerNodo.getSiguiente() == null) {
            return;
        }

        Nodo actual = primerNodo;

        while (actual != null) {
            Nodo siguiente = actual.getSiguiente();
            while (siguiente != null) {
                if (actual.getEstudiante().getApellido().compareToIgnoreCase(siguiente.getEstudiante().getApellido()) > 0) {
                    Estudiante temp = actual.getEstudiante();
                    actual.setEstudiante(siguiente.getEstudiante());
                    siguiente.setEstudiante(temp);
                }
                siguiente = siguiente.getSiguiente();
            }
            actual = actual.getSiguiente();
        }
    }
}
