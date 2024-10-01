public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, int edad, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void actualizarPeso(double nuevoPeso){
        this.peso=nuevoPeso;
    }
    public void incrementarEdad(){
        this.edad++;
    }
    public String decribirMascota(){
        return "Nombre: "+nombre+", Raza: "+raza+", Edad: "+edad+", Peso: "+peso+"Kg";
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }

}
