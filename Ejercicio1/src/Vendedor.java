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
            return "Acetable";
        }else{
            return "Bajo";
        }
    }
}
