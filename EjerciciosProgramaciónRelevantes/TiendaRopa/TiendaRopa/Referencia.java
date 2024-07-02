package TiendaRopa;

public class Referencia {
	
	String ref;
	int cont=0;

	public Referencia(PrendaRopa p) {
		cont++;
		this.ref = generarReferencia(p);
		
	}
	
	public String generarReferencia(PrendaRopa p) {
		if(p.equalsIgnoreCase("Accesorio")) {
			if(cont<10) {
				return "286"+"-"+"00"+cont+"-"+"00";
			}
			else if(cont<100) {
				return "286"+"-"+"0"+cont+"00";
			}
			else return "286"+"-"+cont+"00";
		}
		else if(tipo.equalsIgnoreCase("Top")) {
			if(cont<10) {
				return "412"+"-"+"00"+cont+"-"+talla;
			}
			else if(cont<100) {
				return "412"+"-"+"0"+cont+"-"+talla;
			}
			else return "412"+"-"+cont+"-"+talla;
		}
		else if(tipo.equalsIgnoreCase("Falda")) {
			if(cont<10) {
				return "612"+"-"+"00"+cont+"-"+talla;
			}
			else if(cont<100) {
				return "612"+"-"+"0"+cont+"-"+talla;
			}
			else return "612"+"-"+cont+"-"+talla;
		}
		else if(tipo.equalsIgnoreCase("Pantalon")) {
			if(cont<10) {
				return "614"+"-"+"00"+cont+"-"+talla;
			}
			else if(cont<100) {
				return "614"+"-"+"0"+cont+"-"+talla;
			}
			else return "614"+"-"+cont+"-"+talla;
		}
		else return "";
	}
	
}
