package Logica;

public class Cliente extends Persona implements Usuario{

    private boolean membresia;
 

    public Cliente(boolean membresia, String nombre, String correo, int edad, boolean sexo) {
        super(nombre, correo, edad, sexo);
        this.membresia = membresia;
    }

    public Cliente() {
        super("Angela", "angela@udla.edu.co", 25, false);
        this.membresia = true;

    }

    public boolean isMembresia() {
        return membresia;
    }

    public void setMembresia(boolean membresia) {
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return super.toString() + " Cliente " + ((membresia) ? "Membresía GOLD" : "No tiene membresía");
    }

    @Override
    public boolean iniciarSesion(String nombreUsuario, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
