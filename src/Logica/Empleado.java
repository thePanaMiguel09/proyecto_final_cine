package Logica;

public class Empleado extends Persona implements Usuario{

    private float salario;
    private String cargo;

    public Empleado(float salario, String cargo, String nombre, String correo, int edad, boolean sexo) {
        super(nombre, correo, edad, sexo);
        this.salario = salario;
        this.cargo = cargo;
    }

    

    public Empleado() {
        super("Camilo", "camilo@com", 23, true);
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

    @Override
    public boolean iniciarSesion(String nombreUsuario, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
