package Logica;

public class Usuario extends Persona {

    private String contrasenia;
    private String roll;
    

    public Usuario(String contrasenia, String nombre, String correo, int edad, boolean sexo, long cell, String roll) {
        super(nombre, correo, edad, sexo, cell);
        this.contrasenia = contrasenia;
        this.roll = roll;
        
    }

    public Usuario() {
        super("Mario", "mario@gmial", 22, true, 3245678909L);
        this.contrasenia = "Mario1999";
        this.roll = "Administrador";
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    
    
}
