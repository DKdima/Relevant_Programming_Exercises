package TiendaRopa;

public class Top extends PrendaRopa{

	public Top(Referencia referencia, String descripcion, int stock, double precio, String tipo, String talla) {
		super(referencia, descripcion, stock, precio, tipo, talla);
		// TODO Auto-generated constructor stub
	}
	public boolean tallaValida(String talla) {
		
		if (talla.equals("XS")||talla.equals("S")||talla.equals("M")||talla.equals("L")||talla.equals("XL")) {
			return true;
		}
		
		return false;
	}
}
