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

    public boolean agregarUsuario(String user, String contrasenia, String nombre, String correo, int edad, boolean sexo, long cell, String roll) {
        Usuario nuevo = new Usuario(user, contrasenia, nombre, correo, edad, sexo, cell, roll);

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = nuevo;
                return false;
            }
        }
        return false;
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
            if (users[i] != null && users[i].getNombre().equals(parametro) || users[i].getCell() == Long.parseLong(parametro) || users[i].getCorreo().equals(parametro)) {
                return i;
            }
        }
        return -1;
    }

    public boolean reserarSilla(int numSala, String funcion, int numFila, int numCom, String parametro) {
        int pos = buscarSala(numSala);
        int posCliente = buscarUsuario(parametro);
        if (pos != -1 && posCliente != -1 && salas[pos].getFuncion().equals(funcion)) {
            Usuario tmp = users[posCliente];
            salas[pos].asignarSilla(numFila, numCom, tmp);
            return true;

        }
        return false;
    }

}
