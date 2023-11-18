import java.util.List;

public class Usuario implements Interfazlab {
    

    // Constructor, getters y setters...

    @Override
    public String fechaViaje(String fecha) {
        return "Fecha de viaje: " + fecha;
    }

    @Override
    public String roundTrip(String roundTrip) {
        return "Tipo de viaje: " + roundTrip;
    }

    @Override
    public String cantidadBoletos(String cantidad) {
        return "Cantidad de boletos: " + cantidad;
    }

    @Override
    public String aerolinea(String aero) {
        return "Aerolínea: " + aero;
    }

    @Override
    public String numeroTarjeta(String numero) {
        return "Número de tarjeta: " + numero;
    }

    @Override
    public int cantidadCuotas(int cuotas) {
        return cuotas;
    }

    @Override
    public String claseVuelo(String clase) {
        return "Clase de vuelo: " + clase;
    }

    @Override
    public String numeroAsiento(String asiento) {
        return "Número de asiento: " + asiento;
    }

    @Override
    public int cantidadMaletas(int maletas) {
        return maletas;
    }

    @Override
    public String modificarTipoCliente(String tipoCliente) {
        return "Tipo de cliente modificado con éxito.";
    }

    @Override
    public int descuento10() {
        return 10; // Aquí podrías implementar la lógica real del descuento
    }

    @Override
    public String cambiarContra(String contra) {
        return "Contraseña cambiada con éxito.";
    }
}
