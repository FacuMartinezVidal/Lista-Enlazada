public interface TDA {
    void inicializarLista();
    void agregarElemento(Estudiante estudiante);
    boolean haySiguiente();
    Estudiante siguiente();
    void eliminarElemento(int codigo);
    void ordenarLista();


}
