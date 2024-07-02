package AkiTematon;

public abstract class Empleado extends Persona {
	
    protected int codEmpleado;
    protected int horasExtras;
    
    public Empleado(String dni, String nombre, String apellido, int codEmpleado, int horasExtras) {
        super(dni, nombre, apellido);
        this.codEmpleado = codEmpleado;
        this.horasExtras = horasExtras;
    }
    public Empleado() {}
    
    public abstract void mostrar();
    public abstract double salario();
}
