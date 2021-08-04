package co.edu.utp.misiontic2022.c2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
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
        Integer tamano = vehiculos.size();
        return tamano;
    }

    public Double calcularSubtotal() {
        Double subtotal = 0d;
        for (Vehiculo vehiculo : vehiculos) {
            subtotal += vehiculo.calcularPrecio();
        }
        return subtotal;
    }

    public Double calcularDescuentos() {
        Double descuento = 0d;
        for (Vehiculo vehiculo : vehiculos) {
            descuento += vehiculo.calcularDescuento(fecha);
        }
        return descuento;
    }

    public Double calcularImpuestos() {
        Double impuesto = 0d;
        System.out.println("Fecha" + fecha);
        for (Vehiculo vehiculo : vehiculos) {
            impuesto = (vehiculo.calcularPrecio() - vehiculo.calcularDescuento(fecha));
            impuesto *= vehiculo.calcularPorcentajeImpuesto() / 100;
        }
        return impuesto;
    }

    public Double calcularTotal() {
        return calcularSubtotal() - calcularDescuentos() + calcularImpuestos();
    }
}
