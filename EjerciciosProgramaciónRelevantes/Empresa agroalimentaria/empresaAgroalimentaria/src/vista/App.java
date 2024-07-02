package vista;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import modelos.P_Congelado_Agua;
import modelos.P_Congelado_Aire;
import modelos.P_Congelado_Nitrogeno;
import modelos.P_Fresco;
import modelos.P_Refrigerado;
import modelos.Producto;

public class App {
  public static void main(String[] args) throws Exception {

    ArrayList<Producto> productos = new ArrayList<>();

    productos.add(new P_Fresco(new GregorianCalendar(2023, 8 ,24), new GregorianCalendar(2023, 3, 8), 100, "España"));
    productos.add(new P_Fresco(new GregorianCalendar(2023, 6 ,20), new GregorianCalendar(2023, 2, 6), 101, "Alemania"));

    productos.add(new P_Refrigerado(new GregorianCalendar(2023, 8 ,24), new GregorianCalendar(2023, 3, 8), 2, "España", 12, "138848A"));
    productos.add(new P_Refrigerado(new GregorianCalendar(2023, 8 ,24), new GregorianCalendar(2023, 3, 8), 45, "España", 5, "135348A"));
    productos.add(new P_Refrigerado(new GregorianCalendar(2023, 8 ,24), new GregorianCalendar(2023, 3, 8), 20, "India", 20, "628888A"));

    productos.add(new P_Congelado_Agua(new GregorianCalendar(2023, 8 ,24), new GregorianCalendar(2023, 3, 8), 10, "Grecia", 3, 100));
    productos.add(new P_Congelado_Agua(new GregorianCalendar(2023, 8 ,24), new GregorianCalendar(2023, 3, 8), 10, "Grecia", 3, 100));
    
    productos.add(new P_Congelado_Aire(new GregorianCalendar(2023, 8 ,24), new GregorianCalendar(2023, 3, 8), 0, null, 0, 0, 0, 0, 0));
    productos.add(new P_Congelado_Aire(new GregorianCalendar(2023, 8 ,24), new GregorianCalendar(2023, 3, 8), 0, null, 0, 0, 0, 0, 0));

    productos.add(new P_Congelado_Nitrogeno(new GregorianCalendar(2023, 8 ,24), new GregorianCalendar(2023, 3, 8), 0, null, 0, null, 0));
    
    productos.forEach(p -> System.out.println(p + "\n"));
  }
}
