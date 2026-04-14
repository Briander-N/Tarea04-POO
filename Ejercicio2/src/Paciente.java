public class Paciente {
    public String nombre;
    public String id;

    private String tipoSeguro;
    private int edad;
    private double costoConsulta;
    private int numeroConsultas;
    private int prioridad;

    public Paciente (String nombre, String id, String tipoSeguro, int edad, double costoConsulta, int numeroConsultas, int prioridad){
        this.nombre = nombre;
        this.id = id;
        this.tipoSeguro = tipoSeguro;

        if(edad > 0){
            this.edad = edad;
        }else{
            this.edad = 1;
        }

        if (costoConsulta > 0) {
            this.costoConsulta = costoConsulta;
        } else{
            this.costoConsulta = 1;
        }

        if(numeroConsultas >= 0) {
            this.numeroConsultas = numeroConsultas;
        } else {
            this.numeroConsultas = 0;
        }

        if (prioridad >= 1 && prioridad <= 5) {
            this.prioridad = prioridad;
        } else {
            this.prioridad = 1;
        }
    }

    public int getEdad() {
        return edad;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public double calcularCostoTotal(){
        return getCostoConsulta() * numeroConsultas;
    }

    public double calcularDescuento(){
        double total = calcularCostoTotal();

        if(tipoSeguro == "Basico"){
            System.out.println("Descuento del 10%");
            return  total - (total * 0.10);
        }else if(tipoSeguro == "Premium"){
            System.out.println("Descuento del 20%");
            return total - (total * 0.20);
        }else{
            System.out.println("No aplica descuento");
            return total;
        }
    }
    public String clasificacionPrioridad() {
        if (prioridad >= 4){
            return "Alta prioridad";
        }else if(prioridad >= 2) {
            return "Prioridad media";
        } else{
            return "Prioridad baja";
        }
    }
    public String mensajeMedico() {
        String clasificacion = clasificacionPrioridad();

        if (clasificacion == "Alta prioridad"){
            return "Atención inmediata requerida";
        }else if (clasificacion == "Prioridad media"){
            return "Seguimiento necesario";
        } else {
            return "Control regular";
        }
    }
    public void mostrarReporte() {
        System.out.println("===== REPORTE MÉDICO =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Seguro: " + tipoSeguro);
        System.out.println("Edad: " + getEdad());
        System.out.println("Consultas: " + numeroConsultas);
        System.out.println("Costo total: " + calcularCostoTotal());
        System.out.println("Precio con Descuento: " + calcularDescuento());
        System.out.println("Prioridad: " + clasificacionPrioridad());
        System.out.println("Mensaje: " + mensajeMedico());
    }
}
