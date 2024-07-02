package AkiTematon;

public class Medico extends EmpleadoPlantilla {
	
    private String especialidad;

	public Medico(String dni, String nombre, String apellido, int codEmpleado, int horasExtras, double salarioBaseMensual,
			double porcentajeAdicionalHoraExtra, String especialidad) {
		super(dni, nombre, apellido, codEmpleado, horasExtras, salarioBaseMensual, porcentajeAdicionalHoraExtra);
		this.especialidad = especialidad;
	}
	
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
        return super.salario();
    }
}    
