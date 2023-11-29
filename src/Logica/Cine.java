package Logica;

public class Cine {

    private SalaCine[] salas;
    private Pelicula[] cartelera;
    private String nombre;
    private Empleado[] usuarioEmpleado;
    private Administrador[] usuarioAdministrador;
    private Cliente[] usuarioCliente;

    public Cine(SalaCine[] salas, Pelicula[] cartelera, String nombre, Empleado[] usuarioEmpleado, Administrador[] usuarioAdministrador, Cliente[] usuarioCliente) {
        this.salas = salas;
        this.cartelera = cartelera;
        this.nombre = nombre;
        this.usuarioEmpleado = usuarioEmpleado;
        this.usuarioAdministrador = usuarioAdministrador;
        this.usuarioCliente = usuarioCliente;

    }

    public Cine() {
        this.salas = new SalaCine[10];
        this.cartelera = new Pelicula[10];

        this.nombre = "CineMovies";

        for (int i = 0; i < salas.length; i++) {
            salas[i] = null;
        }
        for (int i = 0; i < cartelera.length; i++) {
            cartelera[i] = null;
        }

        this.usuarioEmpleado = new Empleado[5];

        this.usuarioAdministrador = new Administrador[2];

        this.usuarioCliente = new Cliente[5];

        for (int i = 0; i < usuarioEmpleado.length; i++) {
            usuarioEmpleado[i] = null;
        }
        for (int i = 0; i < usuarioAdministrador.length; i++) {
            usuarioAdministrador[i] = null;
        }
        for (int i = 0; i < usuarioCliente.length; i++) {
            usuarioCliente[i] = null;
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

    public String getUsuarioEmpleadotoString() {
        String mostrar = "";
        for (int i = 0; i < usuarioEmpleado.length; i++) {
            mostrar += ((usuarioEmpleado[i] == null) ? "" : "[" + usuarioEmpleado[i].getNombre() + "]" + "\n");
        }
        return mostrar;
    }

    public void setUsuarioEmpleado(Empleado[] usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }

    public String getUsuarioAdministradortoString() {
        String mostrar = "";
        for (int i = 0; i < usuarioAdministrador.length; i++) {
            mostrar += ((usuarioAdministrador[i] == null) ? "" : "[" + usuarioAdministrador[i].getNombre() + "]" + "\n");
        }
        return mostrar;
    }

    public void setUsuarioAdministrador(Administrador[] usuarioAdministrador) {
        this.usuarioAdministrador = usuarioAdministrador;
    }

    public String getUsuarioClientetoString() {
        String mostrar = "";
        for (int i = 0; i < usuarioCliente.length; i++) {
            mostrar += ((usuarioCliente[i] == null) ? "" : "[" + usuarioCliente[i].getNombre() + "]" + "\n");
        }
        return mostrar;
    }

    public void setUsuarioCliente(Cliente[] usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }

    @Override
    public String toString() {
        return "Cine " + nombre + "\n" + "Salas\n " + getSalastoString() + "\n" + "Cartelera " + getCarteleratoString() + "\n" + getUsuarioAdministradortoString() + "\n" + getUsuarioEmpleadotoString() + "\n" + getUsuarioClientetoString();
    }

    public boolean agregarUsuario(String nombre, String correo, int edad, boolean sexo, float salario, boolean membresia, String cargo, int opc) {
        if (opc >= 1 || opc <= 3) {
            switch (opc) {
                case 1:
                    for (int i = 0; i < usuarioEmpleado.length; i++) {
                        Persona emp = (Persona) new Empleado(salario, cargo, nombre, correo, edad, sexo);
                        if (usuarioEmpleado[i] == null) {
                            usuarioEmpleado[i] = (Empleado) emp;
                            return true;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < usuarioAdministrador.length; i++) {
                        Persona adm = (Persona) new Administrador(salario, nombre, correo, edad, sexo);
                        if (usuarioAdministrador[i] == null) {
                            usuarioAdministrador[i] = (Administrador) adm;
                            return true;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < usuarioCliente.length; i++) {
                        Persona cli = (Persona) new Cliente(membresia, nombre, correo, edad, sexo);
                        if (usuarioCliente[i] == null) {
                            usuarioCliente[i] = (Cliente) cli;
                            return true;
                        }
                    }
                    break;
            }

        }
        return false;
    }

    public boolean crearNuevaSala(int numF, int numC, int numS) {
        SalaCine nueva = new SalaCine(null, new Cliente[numF][numC], numS, "");
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

    public int buscarCliente(String parametro) {
        for (int i = 0; i < usuarioCliente.length; i++) {
            if (usuarioCliente[i] != null && usuarioCliente[i].getNombre().equals(parametro)) {
                return i;
            }
        }
        return -1;
    }

    public boolean reserarSilla(int numSala, String funcion, int numFila, int numCom, String parametro) {
        int pos = buscarSala(numSala);
        int posCliente = buscarCliente(parametro);
        if (pos != -1 && posCliente != -1 && salas[pos].getFuncion().equals(funcion)) {
            Cliente tmp = usuarioCliente[posCliente];
            salas[pos].asignarSilla(numFila, numCom, tmp);
            return true;
           
        }
        return false;
    }
    
    

}