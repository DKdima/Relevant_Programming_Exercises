package modelos;

import java.util.GregorianCalendar;

public abstract class Producto_Temperatura extends Producto {
  private double temperaturaMantenimiento;

  public Producto_Temperatura(GregorianCalendar fechaCaducidad, GregorianCalendar fechaEnvasado, int numeroLote, String paisOrigen,
      double temperaturaMantenimiento) {
    super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen);
    this.temperaturaMantenimiento = temperaturaMantenimiento;
  }

  public double getTemperaturaMantenimiento() {
    return temperaturaMantenimiento;
  }

  public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
    this.temperaturaMantenimiento = temperaturaMantenimiento;
  }

  @Override
  public String toString() {
    return ", temperaturaMantenimiento=" + temperaturaMantenimiento + super.toString();
  }
}
