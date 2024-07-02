package Figuras_abstracta;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		ArrayList <FiguraGeometrica> figuras=new ArrayList();
		int variable=0;
		do{
			System.out.println("1.Añadir figura");
			System.out.println("2.Mostrar figura");
			System.out.println("3.Salir");
			System.out.println("Inserte una opción: ");
			System.out.println("- - - - -");
			variable=reader.nextInt();
			switch(variable){
				case 1:
					System.out.println("¿Que figura quiere añadir?");
					System.out.println("1.Añadir Cuadrado");
					System.out.println("2.Añadir Rectángulo");
					System.out.println("3.Añadir Círculo");
					System.out.println("4.Añadir Rombo");
					System.out.println("Inserte una opción: ");
					System.out.println("- - - - -");
					int figura=reader.nextInt();
					switch(figura) {
						case 1:
							System.out.println("Inserte la posición X: ");
							int x=reader.nextInt();
							System.out.println("Inserte la posición Y: ");
							int y=reader.nextInt();
							System.out.println("Inserte un lado: ");
							double lado=reader.nextDouble();
							FiguraGeometrica c=new Cuadrado(x,y,lado);
							figuras.add(c);
							System.err.println("- El cuadrado fué creado correctamente -");
							break;
						case 2:
							System.out.println("Inserte la posición X: ");
							x=reader.nextInt();
							System.out.println("Inserte la posición Y: ");
							y=reader.nextInt();
							System.out.println("Inserte un lado: ");
							lado=reader.nextDouble();
							System.out.println("Inserte el segundo lado: ");
							double lado2=reader.nextDouble();
							FiguraGeometrica r=new Rectangulo(x,y,lado,lado2);
							figuras.add(r);
							System.err.println("- El rectángulo fué creado correctamente -");
							break;
						case 3:
							System.out.println("Inserte la posición X: ");
							x=reader.nextInt();
							System.out.println("Inserte la posición Y: ");
							y=reader.nextInt();
							System.out.println("Inserte un radio: ");
							lado=reader.nextDouble();
							FiguraGeometrica cir=new Circulo(x,y,lado);
							figuras.add(cir);
							System.err.println("- El círculo fué creado correctamente -");
							break;
						case 4:
							System.out.println("Inserte la posición X: ");
							x=reader.nextInt();
							System.out.println("Inserte la posición Y: ");
							y=reader.nextInt();
							System.out.println("Inserte el alto: ");
							lado=reader.nextDouble();
							System.out.println("Inserte el ancho: ");
							lado2=reader.nextDouble();
							FiguraGeometrica rom=new Rombo(x,y,lado,lado2);
							figuras.add(rom);
							System.err.println("- El rectángulo fué creado correctamente -");
							break;
						default: System.err.println("- El carácter introducido no pertenece al menú -");
					}
					break;
				case 2:
						for(int i=0;i<figuras.size();i++) {
						figuras.get(i).mostrar();
					}
					System.out.println("- - - - -");
					break;	
				case 3:System.out.println("- Fin del programa- ");
					break;
				default: System.err.println("- El carácter introducido no pertenece al menú -");
			}			
		}
		while(variable!=3);
	}
}
