
package Logica;

public class Pelicula {
    
    private String nombre;
    private String clasificacion;
    private String sinopsis;
    private int duracion;
    private boolean tipo;

    public Pelicula(String nombre, String clasificacion, String sinopsis, int duracion, boolean tipo) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.sinopsis = sinopsis;
        this.duracion = duracion;
        this.tipo = tipo;
    }
    
    public Pelicula() {
        this.nombre = "Hola";
        this.clasificacion = "Para Todos";
        this.sinopsis = "Buena peli";
        this.duracion = 130;
        this.tipo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pelicula " +  nombre + "\n" + "Clasificacion " + clasificacion + "\n" +  "Sinopsis " + sinopsis + "\n" +"Duracion " + duracion +" minutos" + "\n" + "Tipo " + ((tipo)?"3D":"2D");
    }
    
    
    
    
    
            
}
