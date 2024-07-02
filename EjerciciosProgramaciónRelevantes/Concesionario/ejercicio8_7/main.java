package ejercicio8_7;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Coche c1 =new Coche("4677FKN","Suzuki","Swift",192000,9000);
		System.out.print(c1.getMatricula());
		ArrayList <Concesionario> Suzuki=new ArrayList();
		Suzuki.cargarCoche();
	
	}
}
