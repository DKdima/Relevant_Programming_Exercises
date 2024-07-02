package modelos;

import java.util.GregorianCalendar;

public class P_Congelado_Aire extends P_Congelado {
  private double porcentajeNitrogeno;
  private double porcentajeO2;
  private double porcentajeCO2;
  private double porcentajeVaporAgua;
  
  public P_Congelado_Aire(GregorianCalendar fechaCaducidad, GregorianCalendar fechaEnvasado, int numeroLote, String paisOrigen,
      double temperaturaMantenimiento, double porcentajeNitrogeno, double porcentajeO2, double porcentajeCO2,
      double porcentajeVaporAgua) {
    super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen, temperaturaMantenimiento);
    this.porcentajeNitrogeno = porcentajeNitrogeno;
    this.porcentajeO2 = porcentajeO2;
    this.porcentajeCO2 = porcentajeCO2;
    this.porcentajeVaporAgua = porcentajeVaporAgua;
  }

  @Override
  public String toString() {
    return ">-*-< P_Congelado_Aire: porcentajeNitrogeno=" + porcentajeNitrogeno + ", porcentajeO2=" + porcentajeO2
        + ", porcentajeCO2=" + porcentajeCO2 + ", porcentajeVaporAgua=" + porcentajeVaporAgua + super.toString();
  }
}
