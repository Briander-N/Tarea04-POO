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

}
