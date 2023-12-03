package Logica;

public class Administrador extends Usuario {

    private float salario;
    private String cargo;

    public Administrador(float salario, String cargo, String user, String contrasenia, String nombre, String correo, int edad, boolean sexo, long cell) {
        super(user, contrasenia, nombre, correo, edad, sexo, cell);
        this.salario = salario;
        this.cargo = cargo;
    }

    public Administrador() {
        super("dario23", "da2023", "Dario", "dario@udla", 32, true, 1234567898L);
        this.salario = 2300000F;
        this.cargo = "Jefe";
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Administrador " + super.toString() + " Salario " + salario + " Cargo=" + cargo;
    }

}
