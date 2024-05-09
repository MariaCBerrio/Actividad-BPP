public class Vehiculo {
    private int limiteInferior, limiteInferiorIntermedio, limiteSuperior, velocidad;
    private String tipoVehiculo;
    private boolean verificarTipoVehiculo;

    public Vehiculo(String tipoVehiculo, int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior, int velocidad) {
        if (tipoVehiculo.equals("Carro") || tipoVehiculo.equals("Camión") || tipoVehiculo.equals("Mula")) {
            this.verificarTipoVehiculo = true;
        } else {
            this.verificarTipoVehiculo = false;
        }
        this.limiteInferior = limiteInferior;
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
        this.limiteSuperior = limiteSuperior;
        this.velocidad = velocidad;
        this.tipoVehiculo = tipoVehiculo;
    }


    public int getLimiteInferior() {
        return limiteInferior;
    }

    public int getLimiteInferiorIntermedio() {
        return limiteInferiorIntermedio;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public boolean isVerificarTipoVehiculo() {
        return verificarTipoVehiculo;
    }
}
