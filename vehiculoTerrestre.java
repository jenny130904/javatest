public class vehiculoTerrestre extends vehiculo{
    public vehiculoTerrestre() {
    }

    public vehiculoTerrestre(String marca, String modelo, int anioFabricacion) {
        super(marca, modelo, anioFabricacion);
    }

    public vehiculoTerrestre(String marca, String modelo) {
        super(marca, modelo);
    }

    public vehiculoTerrestre(String modelo, int anioFabricacion) {
        super(modelo, anioFabricacion);
    }
}