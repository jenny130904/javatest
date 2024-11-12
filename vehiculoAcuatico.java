public class vehiculoAcuatico extends vehiculo{

    private int no_motores;
    public vehiculoAcuatico(String marca, String modelo, int anioFabricacion, int no_motores) {
        super(marca, modelo, anioFabricacion);
        this.no_motores = no_motores;
    }

    public vehiculoAcuatico(String marca, String modelo) {
        super(marca, modelo);
    }

    public vehiculoAcuatico(String modelo, int anioFabricacion) {
        super(modelo, anioFabricacion);
    }

    public vehiculoAcuatico() {
    }

    public int getNo_motores() {
        return no_motores;
    }

    public void setNo_motores(int no_motores) {
        this.no_motores = no_motores;
    }
    @Override
    public String mostrarMensaje (){
        return "El vehículo de la marca " + super.getMarca() + " con el modelo " + super.getModelo() + " del año " + super.getAnioFabricacion() + " y tiene " + no_motores + " motores ";
    }
}
