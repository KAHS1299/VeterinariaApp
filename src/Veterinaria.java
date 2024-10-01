import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private  List<Mascota> listaMascotas;
    private  List<ConsultaMedica> historialConsultas;

    // Constructor
    public Veterinaria() {
        this.listaMascotas = new ArrayList<>();
        this.historialConsultas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        listaMascotas.add(mascota);
    }

    public void registrarConsulta(ConsultaMedica consulta) {
        historialConsultas.add(consulta);
    }

    public void mostrarHistorialConsultas(Mascota mascota) {
        System.out.println("Historial de consultas para: " + mascota.getNombre());
        for (ConsultaMedica consulta : historialConsultas) {
            if (consulta.getMascota().equals(mascota)) {
                System.out.println(consulta);
            }
        }
    }

    public double calcularCostoTotal(Mascota mascota) {
        double costoTotal = 0;
        for (ConsultaMedica consulta : historialConsultas) {
            if (consulta.getMascota().equals(mascota)) {
                costoTotal += consulta.calcularCosto();
            }
        }
        return costoTotal;
    }

    public Mascota buscarMascotaPorNombre(String nombre) {
        for (Mascota mascota : listaMascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                return mascota;
            }
        }
        return null;
    }
}