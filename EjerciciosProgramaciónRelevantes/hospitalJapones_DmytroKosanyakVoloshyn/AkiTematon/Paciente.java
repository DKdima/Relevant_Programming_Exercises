package AkiTematon;

public class Paciente extends Persona {
	
    private int numHistoriaClinica;
    private String[] alergenos;
    
    public Paciente(String dni, String nombre, String apellido, int numHistoriaClinica, String[] alergenos) {
        super(dni, nombre, apellido);
        this.numHistoriaClinica = numHistoriaClinica;
        if (alergenos.length == 0) {
            this.alergenos = new String[]{"Sin alergias"};
        } else {
            this.alergenos = alergenos;
        }
    }   
    public Paciente() {
        this.alergenos = new String[]{"Sin alergias"};
    }
    
    @Override
    public void mostrar() {
        System.out.println("DATOS DEL PACIENTE: ");
        System.out.println("NOMBRE: " + super.nombre);
        System.out.println("APELLIDO: " + super.apellido);
        System.out.println("HISTORIA CLÍNICA: " + numHistoriaClinica);
        System.out.print("ALÉRGENOS: ");
        for(int i=0;i<alergenos.length;i++) {
        	String a=alergenos[i];
        	if(i==0) {
        		System.out.print(a);
        	}
        	else System.out.print(", " + a);
        }
        System.out.println("");
        System.out.println("");
    }
    
    public boolean esAlergico(String alergeno) {
        for (String a : alergenos) {
            if (a.equalsIgnoreCase(alergeno)) {
                return true;
            }
        }
        return false;
    }
}
