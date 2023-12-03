package Logica;

 public class Persona {

    private String nombre;
    private String correo;
    private int edad;
    private boolean sexo;
    private long cell;

    public Persona(String nombre, String correo, int edad, boolean sexo, long cell) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.sexo = sexo;
        this.cell = cell;
    }

    public Persona() {
        this.nombre = "Miguel";
        this.correo = "mi.chavez@udla.edu.co";
        this.edad = 18;
        this.sexo = true;
        this.cell = 3217633317L;
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

    public long getCell() {
        return cell;
    }

    public void setCell(long cell) {
        this.cell = cell;
    }
    
    

    @Override
    public String toString() {
        return ((sexo) ? "Sr " : "Sra ") + nombre + "\nCorreo " + correo + "\n" + edad + " años" + "\n" + "Telefono " + cell;
    }

}
