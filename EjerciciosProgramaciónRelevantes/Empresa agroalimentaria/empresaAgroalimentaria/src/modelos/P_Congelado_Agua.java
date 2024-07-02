package modelos;

import java.util.GregorianCalendar;

public class P_Congelado_Agua extends P_Congelado {
  private double salinidadAgua;

  public P_Congelado_Agua(GregorianCalendar fechaCaducidad, GregorianCalendar fechaEnvasado, int numeroLote, String paisOrigen,
      double temperaturaMantenimiento, double salinidadAgua) {
    super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen, temperaturaMantenimiento);
    this.salinidadAgua = salinidadAgua;
  }

  @Override
  public String toString() {
    return ">-*-< P_Congelado_Agua: salinidadAgua=" + salinidadAgua + super.toString();
  }
}
