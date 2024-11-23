//Clase hija que hereda de clase madre Planta
public class Flor extends Planta{

    //Atributos (carcaterísticas)
    private String variedad;
    private String colorPetalos;
    private int cantidadPromedioPetalos;
    private String colorPistillo;
    private String estacionQueFlorece;

    //Constructores
    public Flor(){

    }

    //En el constructor con todos los parametros, tambien se utilizan los atributos de la clase madre que extiende(Planta) y se hace uso de la palabra reservada "super"
    public Flor(String variedad, String colorPetalos, int cantidadPromedioPetalos, String colorPistillo, String estacionQueFlorece,
                     String nombre, double alturaTallo, boolean tieneHojas, String climaIdeal){

        super(nombre, alturaTallo, tieneHojas, climaIdeal);
        this. variedad = variedad;
        this. colorPetalos = colorPetalos;
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
        this.colorPistillo = colorPistillo;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    //Métodos getters and setters

    public String getVariedad(){
        return variedad;
    }
    public void setVariedad(String variedad){
        this.variedad = variedad;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantidadPromedioPetalos() {
        return cantidadPromedioPetalos;
    }

    public void setCantidadPromedioPetalos(int cantidadPromedioPetalos) {
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    //Método abstracto sobrescrito extendido de la clase madre Planta
    public void decirLoQueSoy(){

        System.out.println("Hola yo soy una FLOR");

    }


}
