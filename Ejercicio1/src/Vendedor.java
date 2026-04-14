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

    public double getMontoVendido() {
        return montoVendido;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public double getCumplimiento() {
        return cumplimiento;
    }

    public double calcularComision() {
        return getMontoVendido() * (getPorcentajeComision() / 100);
    }

    public double calcularIngresoTotal(){
        double total = getMontoVendido() + calcularComision();
        return total;
    }

    public String estadoCumplimiento(){
        if(getCumplimiento() >= 90){
            return "Exelente";
        }else if(getCumplimiento() >= 70){
            return "Aceptable";
        }else{
            return "Bajo";
        }
    }

    public String mensajeDesempeno(){
        String estado = estadoCumplimiento();

        if(estado == "Exelente"){
            return "Vendedor con desempeño sobresaliente";
        }else if(estado == "Aceptable"){
            return "Vendedor con desempeño aceptable";
        }else{
            return "Se requiere seguimiento comercial!!!";
        }
    }

    public void mostrarInformacion() {
        System.out.println("===== REPORTE DE VENTAS =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Área: " + area);
        System.out.println("Monto vendido: " + getMontoVendido());
        System.out.println("Porcentaje comisión: " + getPorcentajeComision() + "%");
        System.out.println("Cumplimiento: " + getCumplimiento() + "%");
        System.out.println("-----------------------------");
        System.out.println("Comisión: " + calcularComision());
        System.out.println("Ingreso total: " + calcularIngresoTotal());
        System.out.println("Estado: " + estadoCumplimiento());
        System.out.println("Mensaje: " + mensajeDesempeno());
    }

}
