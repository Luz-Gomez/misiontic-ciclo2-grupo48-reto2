package co.edu.utp.misiontic2022.c2;

public class Automovil extends Vehiculo {
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
        Double precio = precioBase;
        if (transmision == TipoTransmision.AUTOMATICA) {
            precio += (precio * (7d/100));
        }
        if (vidriosElectricos == true) {
            precio += 300_000d;
        }
        if (aireAcondicionado == true) {
            precio += 2_500_000d;
        }
        return precio;
    }

    public Double calcularPorcentajeImpuesto() {
        Double precio = calcularPrecio();
        Double impuesto = 0d;
        if (precio > 80_000_000d) {
            impuesto = 19d;
        }
        return impuesto;
    }
}
