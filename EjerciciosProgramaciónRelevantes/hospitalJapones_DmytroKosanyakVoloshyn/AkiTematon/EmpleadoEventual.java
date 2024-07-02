package AkiTematon;

public class EmpleadoEventual extends Empleado {
    private double honorariosPorHora;
    private int numeroHorasTrabajadas;
    
	public EmpleadoEventual(String dni, String nombre, String apellido, int codEmpleado, int horasExtras,
	double honorariosPorHora, int numeroHorasTrabajadas) {
		super(dni, nombre, apellido, codEmpleado, horasExtras);
		this.honorariosPorHora = honorariosPorHora;
		this.numeroHorasTrabajadas = numeroHorasTrabajadas;
	}
    public EmpleadoEventual() {}
    
    @Override
    public void mostrar() {
        System.out.println("DATOS DEL EMPLEADO: ");
        System.out.println("NOMBRE: " + super.nombre);
        System.out.println("APELLIDO: " + super.apellido);
        System.out.println("CÓDIGO: " + this.codEmpleado);
        System.out.println("Salario base mensual: " + salario());
        System.out.println("");
    }
    
    @Override
    public double salario() {
        double horasHonorario = this.numeroHorasTrabajadas * honorariosPorHora;
        double horasExtra = honorariosPorHora+ (super.horasExtras * honorariosPorHora * 2);
        double salario =horasHonorario+horasExtra;
        return salario;
    }
}
