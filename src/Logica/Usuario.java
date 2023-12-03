package Logica;

public class Usuario extends Persona {

    private String user;
    private String contrasenia;

    public Usuario(String user, String contrasenia, String nombre, String correo, int edad, boolean sexo, long cell) {
        super(nombre, correo, edad, sexo, cell);
        this.user = user;
        this.contrasenia = contrasenia;
    }

    public Usuario() {
        super("Mario", "mario@gmial", 22, true, 3245678909L);
        this.user = "Mario";
        this.contrasenia = "Mario1999";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return super.toString() + " Usuario " + user + " Contraseña " + contrasenia;
    }

}
