package Logica;

public class Cliente extends Usuario {

    private boolean membresia;

    public Cliente(boolean membresia, String user, String contrasenia, String nombre, String correo, int edad, boolean sexo, long cell) {
        super(user, contrasenia, nombre, correo, edad, sexo, cell);
        this.membresia = membresia;
    }
    
    public Cliente() {
        super("Daniela", "dani2000", "Daniela Andrea", "dani.udla", 23, false, 3214941727L);
        this.membresia = false;
    }

    public boolean isMembresia() {
        return membresia;
    }

    public void setMembresia(boolean membresia) {
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return "Cliente " + super.toString() + " Membresia" + ((membresia)?"Gold":"---");
    }
    
    

    
}
