package ejercicio8_7;
import java.util.*;
public class Concesionario {
	
	//Atributos
	private ArrayList<Coche> coches=new ArrayList();
	
	//Métodos
	public Concesionario() {}
	
	public void cargarCoches(){
		Scanner reader = new Scanner(System.in);
		String mat="";
	
		while (mat.equalsIgnoreCase("0")){
			 System.out.println("Inserte la matrícula: ");
			 mat=reader.nextLine();
			 System.out.println("Inserte la marca: "); 
			 String mar=reader.nextLine();
			 System.out.println("Inserte la modelo: "); 
			 String mod=reader.nextLine();
			 System.out.println("Inserte los km: "); 
			 int km=reader.nextInt();
			 System.out.println("Inserte el precio: "); 
			 double p=reader.nextDouble();
			 
			 this.coches.add(new Coche(mat,mar,mod,km,p));
		}
	 }	
	public boolean venderCoche() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Inserte la matrícula para eliminar el coche: "); 
		String mat2=reader.nextLine();
		for(int i=0;i<coches.size();i++) {
			if((coches.get(i).getMatricula())==mat2) {
				coches.remove(i);
				return true;
			}
		}
		
		return false;
	}
}