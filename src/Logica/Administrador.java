package Logica;

public class Administrador extends Persona implements Usuario{

    private float salario;
    private String cargo;

    public Administrador(float salario, String nombre, String correo, int edad, boolean sexo) {
        super(nombre, correo, edad, sexo);
        this.salario = salario;
    }

    public Administrador() {
        super("Carlos", "carlos@udla.edu.co", 21, true);
        this.salario = 3000000F;
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
        return "Administrador " + super.toString() + "\n" + "Salario " + salario + "\n" + "Cargo " + cargo;
    }

    @Override
    public boolean iniciarSesion(String nombreUsuario, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
