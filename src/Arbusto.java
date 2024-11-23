//Clase hija que hereda de clase madre Planta
public class Arbusto extends Planta {

    //Atributos (características)
    private double anchoArbusto;
    private boolean esDomestico;
    private String variedad;
    private String colorDeHojas;
    private boolean sePodaONo;

    //Constructores
    public Arbusto(){

    }
    //En el constructor con todos los parametros, tambien se utilizan los atributos de la clase madre que extiende(Planta) y se hace uso de la palabra reservada "super"
    public Arbusto(double anchoArbusto, boolean esDomestico, String variedad, String colorDeHojas, boolean sePodaONo,
                   String nombre, double alturaTallo, boolean tieneHojas, String climaIdeal){

        super(nombre, alturaTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.colorDeHojas = colorDeHojas;
        this.sePodaONo = sePodaONo;

    }

    //Métodos getters and setters


    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    public void decirLoQueSoy(){

        System.out.println("Hola yo soy un ARBUSTO");

    }
}
