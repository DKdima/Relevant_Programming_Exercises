package AkiTematon;

public class EmpleadoPlantilla extends Empleado {
    private double salarioBaseMensual;
    private double porcentajeAdicionalHoraExtra;
    
    public EmpleadoPlantilla(String dni, String nombre, String apellido, int codEmpleado, int horasExtras,
    double salarioBaseMensual, double porcentajeAdicionalHoraExtra) {
	        super(dni, nombre, apellido, codEmpleado, horasExtras);
	        this.salarioBaseMensual = salarioBaseMensual;
	        this.porcentajeAdicionalHoraExtra = porcentajeAdicionalHoraExtra;
    }
    public EmpleadoPlantilla() {}
    
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
        return this.salarioBaseMensual + (this.porcentajeAdicionalHoraExtra* super.horasExtras * this.salarioBaseMensual/100);
    }
}
