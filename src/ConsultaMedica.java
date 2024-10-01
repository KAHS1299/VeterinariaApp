public class ConsultaMedica {
    private Mascota mascota;
    private String diagnostico;
    private double costoBase;
    private boolean incluyeMedicacion;

    public ConsultaMedica(){
    }

    public ConsultaMedica(Mascota mascota, String diagnostico, double costo, boolean incluyeMedicacion) {
        this.mascota = mascota;
        this.diagnostico = diagnostico;
        this.costoBase = costoBase;
        this.incluyeMedicacion = incluyeMedicacion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costo) {
        this.costoBase = costoBase;
    }

    public boolean isIncluyeMedicacion() {
        return incluyeMedicacion;
    }

    public void setIncluyeMedicacion(boolean incluyeMedicacion) {
        this.incluyeMedicacion = incluyeMedicacion;
    }
    public double calcularCosto(){
        double costoFinal= costoBase;
        if(incluyeMedicacion){
            costoFinal+=costoBase*0.15;
        }
        return costoFinal;
    }

    @Override
    public String toString() {
        return "ConsultaMedica{" +
                "mascota=" + mascota.decribirMascota() +
                ", diagnostico='" + diagnostico + '\'' +
                ", costoBase=" + costoBase +
                ", incluyeMedicacion=" + incluyeMedicacion +
                ", costoFinal=" + calcularCosto()+
                '}';
    }
}
