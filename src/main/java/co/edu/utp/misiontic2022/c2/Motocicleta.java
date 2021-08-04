package co.edu.utp.misiontic2022.c2;

public class Motocicleta extends Vehiculo {
    private Integer cilindraje;

    public Motocicleta(String marca, String modelo, Double precioBase, Integer cilindraje) {
        super(marca, modelo, precioBase);
        this.cilindraje = cilindraje;
        System.out.println("precio base " + precioBase);
    }

    public Double calcularPrecio() {
        Double precio = precioBase;
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
        Double precio = calcularPrecio();
        Double impuesto = 0d;
        if (precio > 6_100_000d) {
            impuesto = precio * (19d/100);
        }
        return impuesto;
    }
}
