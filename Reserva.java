public class Reserva implements Interfazlab {

    private String fechaViaje;
    private String roundTrip;
    private String cantidadBoletos;
    private String aerolinea;
    private String numeroTarjeta;
    private int cantidadCuotas;
    private String claseVuelo;
    private String numeroAsiento;
    private int cantidadMaletas;
    private String tipoCliente;

    // Constructor y otros métodos según sea necesario

    @Override
    public String fechaViaje(String fecha) {
        this.fechaViaje = fecha;
        return "Fecha de Viaje: " + fechaViaje;
    }

    @Override
    public String roundTrip(String roundTrip) {
        this.roundTrip = roundTrip;
        return "Tipo de Viaje: " + roundTrip;
    }

    @Override
    public String cantidadBoletos(String cantidad) {
        this.cantidadBoletos = cantidad;
        return "Cantidad de Boletos: " + cantidadBoletos;
    }

    @Override
    public String aerolinea(String aero) {
        this.aerolinea = aero;
        return "Aerolínea: " + aerolinea;
    }

    @Override
    public String numeroTarjeta(String numero) {
        this.numeroTarjeta = numero;
        return "Número de Tarjeta: " + numeroTarjeta;
    }

    @Override
    public int cantidadCuotas(int cuotas) {
        this.cantidadCuotas = cuotas;
        return cantidadCuotas;
    }

    @Override
    public String claseVuelo(String clase) {
        this.claseVuelo = clase;
        return "Clase de Vuelo: " + claseVuelo;
    }

    @Override
    public String numeroAsiento(String asiento) {
        this.numeroAsiento = asiento;
        return "Número de Asiento: " + numeroAsiento;
    }

    @Override
    public int cantidadMaletas(int maletas) {
        this.cantidadMaletas = maletas;
        return cantidadMaletas;
    }

    @Override
    public String modificarTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
        return "Tipo de Cliente Modificado: " + tipoCliente;
    }

    @Override
    public int descuento10() {
        // Aplicar lógica para calcular el descuento del 10%
        // La lógica específica dependerá de tus requisitos
        return 10;
    }

    @Override
    public String cambiarContra(String contra) {
        // Aplicar lógica para cambiar la contraseña
        // La lógica específica dependerá de tus requisitos
        return "Contraseña Cambiada: " + contra;
    }
}
