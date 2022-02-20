package Sesion23;

abstract class Vehiculo {
    String tipo;

    public String getTipoVehiculo() {
        return tipo;
    }
}


class Coche extends Vehiculo {
    String tipo;

    public Coche() {
    }

    public Coche(String tipo) {

        this.tipo = tipo;
    }



    //supongamos que esta clase ya esta cerrada y queremos implementar mas cosas
}
//pues, creamos otra clase

class CocheElectrico extends Vehiculo {
    String tipo;
    String baterias;

    public CocheElectrico() {
    }

    public CocheElectrico(String tipo) {

        this.tipo = tipo;
        this.baterias = "si";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setBaterias(String baterias) {
        this.baterias = baterias;
    }

    public String getBaterias() {
        return baterias;
    }
}

