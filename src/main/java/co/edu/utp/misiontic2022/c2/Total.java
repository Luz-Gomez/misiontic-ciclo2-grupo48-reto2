package co.edu.utp.misiontic2022.c2;

public class Total {
}
/**
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

class Reserva {
    private Date fecha;
    private String cliente;

    private List<Vehiculo> vehiculos;

    public Reserva(Date fecha, String cliente) {
        this.fecha = fecha;
        this.cliente = cliente;

        vehiculos = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public void adicionarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Integer calcularCantidadVehiculos() {
        return vehiculos.size();
    }

    public Double calcularSubtotal() {
        var valor = 0d;
        for (Vehiculo vehiculo : vehiculos) {
            valor += vehiculo.calcularPrecio();
        }

        return valor;
    }

    public Double calcularDescuentos() {
        var descuento = 0d;
        for (Vehiculo vehiculo : vehiculos) {
            descuento += vehiculo.calcularDescuento(fecha);
        }

        return descuento;
    }

    public Double calcularImpuestos() {
        var valor = 0d;
        for (Vehiculo vehiculo : vehiculos) {
            valor = (vehiculo.calcularPrecio() - vehiculo.calcularDescuento(fecha));
            valor *= vehiculo.calcularPorcentajeImpuesto() / 100;
        }
        return valor;
    }

    public Double calcularTotal() {
        return calcularSubtotal() - calcularDescuentos() + calcularImpuestos();
    }

}

abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected Double precioBase;

    public Vehiculo(String marca, String modelo, Double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public Double calcularDescuento(Date fecha) {
        // Extrae el mes de la fecha actual.
        // Para comparar el mes use Calendar.JULY o Calendar.JUNE
        var cal = GregorianCalendar.getInstance();
        cal.setTime(fecha);
        var mes = cal.get(Calendar.MONTH);

        var desc = 0d;
        if (marca.equalsIgnoreCase("Mazda") && mes == Calendar.MAY) {
            desc += (10d / 100) * calcularPrecio();
        }

        if (marca.equalsIgnoreCase("BMW") && mes == Calendar.JUNE) {
            desc += (this instanceof Automovil ? 5d : 10d) / 100 * calcularPrecio();
        }

        return desc;
    }

    public abstract Double calcularPrecio();

    public abstract Double calcularPorcentajeImpuesto();
}

class Automovil extends Vehiculo {
    private TipoTransmision transmision;
    private Boolean vidriosElectricos;
    private Boolean aireAcondicionado;

    public Automovil(String marca, String modelo, Double precioBase, TipoTransmision transmision,
            Boolean vidriosElectricos, Boolean aireAcondicionado) {
        super(marca, modelo, precioBase);
        this.transmision = transmision;
        this.vidriosElectricos = vidriosElectricos;
        this.aireAcondicionado = aireAcondicionado;
    }

    public Double calcularPrecio() {
        var precio = precioBase;
        if (transmision == TipoTransmision.AUTOMATICA) {
            precio *= 1.05;
        }
        if (vidriosElectricos) {
            precio += 400_000d;
        }
        if (aireAcondicionado) {
            precio += 3_000_000d;
        }

        return precio;
    }

    public Double calcularPorcentajeImpuesto() {
        return calcularPrecio() >= 80_000_000d ? 19d : 0d;
    }

}

class Motocicleta extends Vehiculo {
    private Integer cilindraje;

    public Motocicleta(String marca, String modelo, Double precioBase, Integer cilindraje) {
        super(marca, modelo, precioBase);
        this.cilindraje = cilindraje;
    }

    public Double calcularPrecio() {
        var precio = precioBase;
        if (cilindraje >= 150 && cilindraje <= 300) {
            precio += 400_000d;
        } else if (cilindraje >= 301 && cilindraje <= 600) {
            precio += 800_000d;
        } else if (cilindraje > 600) {
            precio += 1_200_000d;
        }
        return precio;
    }

    public Double calcularPorcentajeImpuesto() {
        return calcularPrecio() >= 6_100_000d ? 19d : 0d;
    }

}

enum TipoTransmision {
    MANUAL, AUTOMATICA
}
*/
