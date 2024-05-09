public class Comparendo {
    public void construirFotoMulta(Vehiculo vehiculo) {
        int calculoComparendo = calcularComparendo(vehiculo);
        String textoCorreo = enviarCorreoFotomulta(vehiculo);
        if(calculoComparendo == -1){
            System.out.println("\n" + "No hay calculo para el tipo de vehiculo " + calculoComparendo   + "\n" + "--------Correo--------" + "\n" + textoCorreo + "\n") ;
        }else {
            System.out.println("\n" + "El tipo de comparendo es: " + calculoComparendo + "\n" + "--------Correo--------" + "\n" + textoCorreo + "\n");
        }

    }

    private int calcularComparendo(Vehiculo vehiculo) {
        if(vehiculo.isVerificarTipoVehiculo()) {
            if(vehiculo.getVelocidad() <= vehiculo.getLimiteInferior()) {
                return 0;
            }else if (vehiculo.getVelocidad() >= vehiculo.getLimiteInferiorIntermedio() && vehiculo.getVelocidad() <= vehiculo.getLimiteSuperior()) {
                return 1;
            }
            return 2;
        }
        return -1;
    }

    public String enviarCorreoFotomulta(Vehiculo vehiculo) {
        if(vehiculo.isVerificarTipoVehiculo()) {
            String correo = "Asunto: comparendo " + vehiculo.getTipoVehiculo() + "\n" +
                            "Enviando correo para el tipo " + vehiculo.getTipoVehiculo() + "...";
            return correo;
        } else {
            return "Enviando correo con vehiculo desconocido...";
        }
    }
}
