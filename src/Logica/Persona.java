package Logica;

public class Persona {

    private String nombre;
    private String correo;
    private int edad;
    private boolean sexo;

    public Persona(String nombre, String correo, int edad, boolean sexo) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona() {
        this.nombre = "Miguel";
        this.correo = "mi.chavez@udla.edu.co";
        this.edad = 18;
        this.sexo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return ((sexo) ? "Sr " : "Sra ") + nombre + "\nCorreo " + correo + "\n" + edad + " años";
    }

}
