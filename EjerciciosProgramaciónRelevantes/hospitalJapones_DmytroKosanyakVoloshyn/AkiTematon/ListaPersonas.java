package AkiTematon;
import java.util.Scanner;
public class ListaPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente p1=new Paciente ("12345","Emilio","Sánchez",11111,new String[] {"Penicilina","Huevo"});
		Paciente p2=new Paciente ("13335","Pablo","Corcho",22222,new String[] {"Leche","Huevo","Nueces"});
		Paciente p3=new Paciente ("44445","Daniel","Esteban",33333,new String[] {"Sin alergias"});
		
		EmpleadoEventual ee = new EmpleadoEventual("54321","Pepe","González",2222,10,15,150);
		EmpleadoPlantilla ep = new EmpleadoPlantilla("87545","Laura","Pérez",65450,15,1500,5);
		
		Medico m1=new Medico ("66665","Ana","Montero",99950,15,2500,10,"Cirujia");
		Medico m2=new Medico ("64445","Luis","Gómez",88950,8,2000,12,"Dermatología");
		
		Persona [] listaPersonas = new Persona[] {p1,p2,p3,ee,ep,m1,m2};
		
		for(int i=0;i<listaPersonas.length;i++) {
			listaPersonas [i].mostrar();
		}
		
		System.out.println("INSERTE EL ALÉRGENO: ");
		Scanner sc = new Scanner(System.in);
		String alergeno=sc.nextLine();
		
		for(int i=0;i<listaPersonas.length;i++) {
			if(listaPersonas[i] instanceof Paciente) {
				if(((Paciente) listaPersonas[i]).esAlergico(alergeno)) {
				listaPersonas [i].mostrar();}
			}
		}
	}
}