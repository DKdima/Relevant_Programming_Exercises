package modelos;

import java.util.GregorianCalendar;

public class P_Refrigerado extends Producto_Temperatura {
  private String codigoOrganismo;

  public P_Refrigerado(GregorianCalendar fechaCaducidad, GregorianCalendar fechaEnvasado, int numeroLote, String paisOrigen,
      double temperaturaMantenimiento, String codigoOrganismo) {
    super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen, temperaturaMantenimiento);
    this.codigoOrganismo = codigoOrganismo;
  }

  public String getCodigoOrganismo() {
    return codigoOrganismo;
  }

  public void setCodigoOrganismo(String codigoOrganismo) {
    this.codigoOrganismo = codigoOrganismo;
  }

  @Override
  public String toString() {
    return ">-*-< P_Refrigerado: codigo Organismo=" + codigoOrganismo + super.toString();
  }
}
