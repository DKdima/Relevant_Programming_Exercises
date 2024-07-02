package AkiTematon;

public abstract class Persona {
	
	protected String dni;
    protected String nombre;
    protected String apellido;
	
	public Persona(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;    
    }
	 public Persona() {}    
     
	 public abstract void mostrar();

}

