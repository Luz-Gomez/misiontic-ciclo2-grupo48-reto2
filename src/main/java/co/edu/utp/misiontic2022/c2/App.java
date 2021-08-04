package co.edu.utp.misiontic2022.c2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main(String[] args) {
        Date fecha = null;
        try {
            fecha = new SimpleDateFormat("dd/MM/yyyy").parse("10/06/2021");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        var reserva = new Reserva(fecha, "Cesar Díaz");
        reserva.adicionarVehiculo(new Automovil("Mazda", "R8", 150_000_000d, TipoTransmision.MANUAL, true, true));
        reserva.adicionarVehiculo(new Motocicleta("BMW", "S 1000 RR", 60_000_000d, 1000));
        System.out.printf("Cliente: %s %n", reserva.getCliente());
        System.out.printf("Numero vehiculos: %d %n", reserva.calcularCantidadVehiculos());
        System.out.printf("Subtotal: %,.2f %n", reserva.calcularSubtotal());
        System.out.printf("Descuento: %,.2f %n", reserva.calcularDescuentos());
        System.out.printf("Impuestos: %,.2f %n", reserva.calcularImpuestos());
        System.out.printf("Total: %,.2f %n", reserva.calcularTotal());
        System.out.println("-------------------------------------------------------");
        fecha = null;
        try {
            fecha = new SimpleDateFormat("dd/MM/yyyy").parse("17/03/2021");
        } catch (ParseException e) {
            e.printStackTrace();
        }
           
        reserva = new Reserva(fecha, "Carlos Perez");
        reserva.adicionarVehiculo(new Automovil("Kia", "Rio Sedan", 60_000_000d, TipoTransmision.MANUAL, false, false));
        reserva.adicionarVehiculo(new Automovil("Kia", "Rio Hatchback", 64_000_000d, TipoTransmision.AUTOMATICA, true, true));
        reserva.adicionarVehiculo(new Motocicleta("Suzuki", "VStrong", 30_000_000d, 600));
        reserva.adicionarVehiculo(new Motocicleta("Auteco", "VICTORY BOLD", 5_999_000d, 125));
        System.out.printf("Cliente: %s %n", reserva.getCliente());
        System.out.printf("Numero vehiculos: %d %n", reserva.calcularCantidadVehiculos());
        System.out.printf("Subtotal: %,.2f %n", reserva.calcularSubtotal());
        System.out.printf("Descuento: %,.2f %n", reserva.calcularDescuentos());
        System.out.printf("Impuestos: %,.2f %n", reserva.calcularImpuestos());
        System.out.printf("Total: %,.2f %n", reserva.calcularTotal());

    }
}
