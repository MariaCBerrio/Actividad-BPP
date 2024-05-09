public class Main {

    public static void main(String[] args) {
        Comparendo comparendo =  new Comparendo();
        Vehiculo vehiculo1 = new Vehiculo("Carro", 65, 66, 85, 70);
        Vehiculo vehiculo2 = new Vehiculo("Camión", 75, 76, 95, 100);
        Vehiculo vehiculo3 = new Vehiculo("Mula", 95, 96, 110, 95);
        Vehiculo vehiculo4 = new Vehiculo("Avión", 70, 78, 100, 80);
        comparendo.construirFotoMulta(vehiculo1);
        comparendo.construirFotoMulta(vehiculo2);
        comparendo.construirFotoMulta(vehiculo3);
        comparendo.construirFotoMulta(vehiculo4);

    }
}