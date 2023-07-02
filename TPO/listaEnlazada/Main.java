public class Main {
    public static void main(String[] args) {
        //Inicializamos la lista
        ListaDinamica listaEstudiantes = new ListaDinamica();
        listaEstudiantes.inicializarLista();

        // Carga de estudiantes
        listaEstudiantes.agregarElemento(new Estudiante(1, "Ivan", "Levy"));
        listaEstudiantes.agregarElemento(new Estudiante(2, "Facundo", "Martinez"));
        listaEstudiantes.agregarElemento(new Estudiante(3, "Lucas", "Faure"));
        listaEstudiantes.agregarElemento(new Estudiante(4, "Iñaki", "Moreno"));
        listaEstudiantes.agregarElemento(new Estudiante(5, "Gonzalo", "Montiel"));
        listaEstudiantes.agregarElemento(new Estudiante(6, "Lionel", "Messi"));
        listaEstudiantes.agregarElemento(new Estudiante(7, "Lionel", "Scaloni"));
        listaEstudiantes.agregarElemento(new Estudiante(8, "Enzo", "Fernandez"));
        listaEstudiantes.agregarElemento(new Estudiante(9, "Julian", "Alvarez"));
        listaEstudiantes.agregarElemento(new Estudiante(10, "Botellas", "Caras"));

        // Imprimir lista de estudiantes
        System.out.println("Lista de estudiantes:");
        listarEstudiantes(listaEstudiantes);

        // Eliminar estudiante con código 3
        listaEstudiantes.eliminarElemento(3);
        System.out.println("\nLista de estudiantes después de eliminar el estudiante con código 3:");
        listarEstudiantes(listaEstudiantes);

        // Ordenar lista de estudiantes por orden alfabetico
        listaEstudiantes.ordenarLista();
        System.out.println("\nLista de estudiantes ordenada:");
        listarEstudiantes(listaEstudiantes);



    }

    public static void listarEstudiantes(ListaDinamica listaEstudiantes) {
        ListaDinamica auxiliar = new ListaDinamica();
        while (listaEstudiantes.haySiguiente()) {
            Estudiante estudiante = listaEstudiantes.siguiente();
            System.out.println(estudiante.getCodigo() + " - " + estudiante.getApellido() + ", " + estudiante.getNombre());
            auxiliar.agregarElemento(estudiante);
        }
        // Restaurar la lista original
        while (auxiliar.haySiguiente()) {
            listaEstudiantes.agregarElemento(auxiliar.siguiente());
        }
    }
}
