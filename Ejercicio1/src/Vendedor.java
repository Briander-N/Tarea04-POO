public class Vendedor {
    public String nombre;
    public String area;
    private double montoVendido;
    private double porcentajeComision;
    private double cumplimiento;

    public Vendedor(String nombre, String area, double montoVendido, double porcentajeComision, double cumplimiento) {
        this.nombre = nombre;
        this.area = area;
        this.montoVendido = montoVendido;
        this.porcentajeComision = porcentajeComision;
        this.cumplimiento = cumplimiento;

    }
}
