package Logica;

public class SalaCine {

    private Pelicula movie;
    private Usuario[][] silla;
    private int numSala;
    private String funcion;
    private static int ctsalas = 0;

    public SalaCine(Pelicula movie, Usuario[][] silla, int numSala, String funcion) {
        this.movie = movie;
        this.silla = silla;
        this.numSala = numSala;
        this.funcion = funcion;

    }

    public SalaCine() {
        this.movie = null;
        this.silla = new Usuario[3][3];
        this.numSala = ++ctsalas;
        this.funcion = null;
    }

    public Pelicula getMovie() {
        return movie;
    }

    public void setMovie(Pelicula movie) {
        this.movie = movie;
    }

    public String getSillatoString() {
        String mostrar = "";
        for (int i = 0; i < silla.length; i++) {
            for (int j = 0; j < silla[i].length; j++) {
                mostrar += ((silla[i][j] == null) ? "[o]" : "\033[31m[x]\033[0m");
            }
            mostrar += "\n";
        }
        return mostrar;
    }

    public void setSilla(Usuario[][] silla) {
        this.silla = silla;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public int getCtsalas() {
        return ctsalas;
    }

    public void setCtsalas(int ctsalas) {
        this.ctsalas = ctsalas;
    }

    @Override
    public String toString() {
        return "Sala de Cine " + numSala + "\n" + ((movie == null) ? "-----" : movie.toString()) + "\n" + getSillatoString();
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public boolean asignarSilla(int numFila, int numCol, Usuario usuario) {
        if (silla[numFila - 1][numCol - 1] == null) {
            silla[numFila - 1][numCol - 1] = usuario;

            return true;
        }
        return false;
    }

}
