package Logica;

public class Cine {

    private SalaCine[] salas;
    private Pelicula[] cartelera;
    private String nombre;
    private Usuario[] users;

    public Cine(SalaCine[] salas, Pelicula[] cartelera, String nombre, Usuario[] users) {
        this.salas = salas;
        this.cartelera = cartelera;
        this.nombre = nombre;
        this.users = users;

    }

    public Cine() {
        this.salas = new SalaCine[10];
        this.cartelera = new Pelicula[10];

        this.nombre = "CineMovies";

        this.users = new Usuario[10];

        for (int i = 0; i < salas.length; i++) {
            salas[i] = null;
        }
        for (int i = 0; i < cartelera.length; i++) {
            cartelera[i] = null;
        }

        for (int i = 0; i < users.length; i++) {
            users[i] = null;
        }

    }

    public String getSalastoString() {
        String mostrar = "";
        for (int i = 0; i < salas.length; i++) {
            mostrar += ((salas[i] == null) ? "" : salas[i].toString()) + "\n";
        }
        return mostrar;

    }

    public void setSalas(SalaCine[] salas) {
        this.salas = salas;
    }

    public String getCarteleratoString() {
        String mostrar = "";
        for (int i = 0; i < cartelera.length; i++) {
            mostrar += ((cartelera[i] == null) ? "" : cartelera[i].toString()) + "\t";
        }
        return mostrar;
    }

    public void setCartelera(Pelicula[] cartelera) {
        this.cartelera = cartelera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarUsuarios() {
        String mostrar = "";
        for (int i = 0; i < users.length; i++) {
            mostrar += ((users[i] == null) ? "SIN USUARIOS\n" : users[i].toString() + "\n");
        }
        return mostrar;
    }

    @Override
    public String toString() {
        return "Cine " + nombre + "\n" + "Salas\n " + getSalastoString() + "\n" + "Cartelera " + getCarteleratoString() + "\n" + mostrarUsuarios();
    }

    public boolean agregarUsuario(String contrasenia, String nombre, String correo, int edad, boolean sexo, long cell, String roll) {
        Usuario nuevo = new Usuario(contrasenia, nombre, correo, edad, sexo, cell, roll);

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = nuevo;
                return true;
            }
        }
        return false;
    }

    public Usuario buscarUsuario(String contrasenia, String usuario) {

        for (int i = 0; i < users.length; i++) {

            if (users[i] != null) {
                if (users[i].getContrasenia().equals(contrasenia) && users[i].getCorreo().equals(usuario)) {
                    return users[i];
                }
            }
        }
        return null;
    }

    public boolean crearNuevaSala(int numF, int numC, int numS) {
        SalaCine nueva = new SalaCine(null, new Usuario[numF][numC], numS, "");
        for (int i = 0; i < salas.length; i++) {
            if (salas[i] == null) {
                salas[i] = nueva;
                return true;
            }
        }
        return false;
    }

    public int buscarSala(int numSala) {
        for (int i = 0; i < salas.length; i++) {
            if (salas[i].getNumSala() == numSala) {
                return i;
            }
        }
        return -1;
    }

    public int buscarUsuario(String parametro) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getNombre().equals(parametro) || users[i].getCorreo().equals(parametro)) {
                return i;
            }
        }
        return -1;
    }

    public boolean reservarSilla(int numSala, String funcion, int numFila, int numCom, String parametro) {
        int pos = buscarSala(numSala);
        int posCliente = buscarUsuario(parametro);
        if (pos != -1 && posCliente != -1) {
            Usuario tmp = users[posCliente];
            salas[pos].asignarSilla(numFila, numCom, tmp);
            return true;
        }
        return false;
    }

    public String buscarPorParametros(String parametro) {
        String mostrar = "";
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && (users[i].getNombre().equals(parametro) || users[i].getCorreo().equals(parametro))) {
                mostrar += users[i].toString() + "\n";
            }
            
        }
        return mostrar;
    }

    public String mostrarClientes(String nombre) {
        String mostrar = "";
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getNombre().equals(nombre) || users[i].getCorreo().equals(nombre)) {
                mostrar += users[i].toString();
                return mostrar;
            }

        }
        return "USUARIO NO ENCONTRADO";
    }

    public boolean asignarFuncion(int nSala, String nombre, String clasificacion, String sinopsis, int duracion, boolean tipo) {
        for (int i = 0; i < salas.length; i++) {
            if (salas[i].getNumSala() == nSala) {
                Pelicula nueva = new Pelicula(nombre, clasificacion, sinopsis, duracion, tipo);
                salas[i].setMovie(nueva);
                return true;
            }
        }
        return false;
    }

    public String listarClientes() {
        String mostrar = "";
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getRoll().equals("Cliente")) {
                mostrar += users[i].toString()+"\n";
            }
        }
        return mostrar;
    }

}
