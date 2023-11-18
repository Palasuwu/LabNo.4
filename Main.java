import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();  // Puedes crear un objeto Usuario para demostración

        boolean salir = false;
        while (!salir) {
            System.out.println("********** Menú Principal **********");
            System.out.println("1. Realizar Reserva");
            System.out.println("2. Confirmar Reserva");
            System.out.println("3. Consultas VIP");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    realizarReserva(usuario, scanner);
                    break;
                case 2:
                    confirmarReserva(usuario, scanner);
                    break;
                case 3:
                    consultasVIP(usuario);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }

        System.out.println("¡Hasta luego!");
    }

    private static void realizarReserva(Usuario usuario, Scanner scanner) {
       
        System.out.print("Ingrese la información necesaria para realizar la reserva: ");
        String informacionReserva = scanner.nextLine();
        new Reserva(informacionReserva);
        
        System.out.println("Reserva realizada con éxito.");
    }

    private static void confirmarReserva(Usuario usuario, Scanner scanner) {
        // Puedes modificar esta lógica según las necesidades reales
        System.out.print("Ingrese la información necesaria para confirmar la reserva: ");
        String informacionConfirmacion = scanner.nextLine();
        Confirmacion confirmacion = new Confirmacion(informacionConfirmacion); // Puedes crear un objeto Confirmacion con la información ingresada
        // Lógica para confirmar reserva...
        System.out.println("Reserva confirmada con éxito.");
    }

    private static void consultasVIP(Usuario usuario) {
        VIPManager vipManager = new VIPManager();  // Puedes crear un objeto VIPManager para demostración
        System.out.println(vipManager.consultasVIP());
    }
}
