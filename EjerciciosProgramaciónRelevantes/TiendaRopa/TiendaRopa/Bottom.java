package TiendaRopa;

public class Bottom extends PrendaRopa{

	public Bottom(Referencia referencia, String descripcion, int stock, double precio, String tipo, String talla) {
		super(referencia, descripcion, stock, precio, tipo, talla);
		// TODO Auto-generated constructor stub
	}
	public boolean tallaValida(String talla) {
		
		if (talla.equals("32")||talla.equals("34")||talla.equals("36")||talla.equals("38")||talla.equals("40")||talla.equals("42")||talla.equals("44")) {
			return true;
		}
		
		return false;
	}
	
}