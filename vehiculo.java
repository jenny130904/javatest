public class vehiculo {
    private String marca = ""; //Encapsulacion
    private String modelo = "";
    private int anioFabricacion = 0;

    public vehiculo() {

    }

    public vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public vehiculo(String modelo, int anioFabricacion) {
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String mostrarMensaje (){
        return "El vehículo de la marca " + marca + " con el modelo " + modelo + " del año " + anioFabricacion;
    }
}
