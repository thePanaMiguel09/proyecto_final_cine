package Logica;

public class Empleado extends Usuario {

    private float salario;
    private String cargo;

    public Empleado(float salario, String cargo, String user, String contrasenia, String nombre, String correo, int edad, boolean sexo, long cell) {
        super(user, contrasenia, nombre, correo, edad, sexo, cell);
        this.salario = salario;
        this.cargo = cargo;
    }

    

    public Empleado() {
        super("mi.chavez@udla", "Mi2005", "Andres", "mi.chavez@udla", 19, true, 3123358582L);
        this.salario = 1200000F;
        this.cargo = "Auxiliar";
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
        return super.toString() + " Empleado " + "\n" + "Salario " + salario + "\n" + "Cargo " + cargo;
    }

}
