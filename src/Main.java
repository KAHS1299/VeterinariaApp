import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veterinaria veterinaria = new Veterinaria();

        boolean continuar = true;
        while (continuar) {
            System.out.println("---------------------------------");
            System.out.println("            Veterinaria          ");
            System.out.println("---------------------------------");
            System.out.println("1. Agregar nueva mascota");
            System.out.println("2. Registrar nueva consulta médica");
            System.out.println("3. Mostrar historial de consultas de una mascota");
            System.out.println("4. Calcular costo total de consultas de una mascota");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Agregar nueva mascota:");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Raza: ");
                    String raza = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();

                    Mascota nuevaMascota = new Mascota(nombre, raza, edad, peso);
                    veterinaria.agregarMascota(nuevaMascota);
                    System.out.println("<< Mascota agregada exitosamente.>>");
                    break;

                case 2:
                    System.out.println("Registrar nueva consulta médica:");
                    System.out.print("Nombre de la mascota: ");
                    String nombreMascotaConsulta = scanner.nextLine();
                    Mascota mascotaConsulta = veterinaria.buscarMascotaPorNombre(nombreMascotaConsulta);

                    if (mascotaConsulta != null) {
                        System.out.print("Diagnóstico médico: ");
                        String diagnostico = scanner.nextLine();
                        System.out.print("Costo de la consulta: ");
                        double costo = scanner.nextDouble();
                        System.out.print("¿Incluye medicación? (Si/No): ");
                        boolean incluyeMedicacion = scanner.nextBoolean();
                        scanner.nextLine();

                        ConsultaMedica nuevaConsulta = new ConsultaMedica(mascotaConsulta, diagnostico, costo, incluyeMedicacion);
                        veterinaria.registrarConsulta(nuevaConsulta);
                        System.out.println("Consulta registrada exitosamente.");
                    } else {
                        System.out.println("No se encontró una mascota con ese nombre.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre de la mascota: ");
                    String nombreMascotaHistorial = scanner.nextLine();
                    Mascota mascotaHistorial = veterinaria.buscarMascotaPorNombre(nombreMascotaHistorial);

                    if (mascotaHistorial != null) {
                        veterinaria.mostrarHistorialConsultas(mascotaHistorial);
                    } else {
                        System.out.println("No se encontró una mascota con ese nombre.");
                    }
                    break;

                case 4:
                    System.out.print("Nombre de la mascota: ");
                    String nombreMascotaCosto = scanner.nextLine();
                    Mascota mascotaCosto = veterinaria.buscarMascotaPorNombre(nombreMascotaCosto);

                    if (mascotaCosto != null) {
                        double costoTotal = veterinaria.calcularCostoTotal(mascotaCosto);
                        System.out.println("Costo total de las consultas de " + mascotaCosto.getNombre() + ": $" + costoTotal);
                    } else {
                        System.out.println("No se encontró una mascota con ese nombre.");
                    }
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }
}