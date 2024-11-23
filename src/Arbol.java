//Clase hija que hereda de clase madre Planta
public class Arbol extends Planta {

    //Atributos (características)
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHojas;


    //Constructores
    public Arbol() {

    }

    //En el constructor con todos los parametros, tambien se utilizan los atributos de la clase madre que extiende(Planta) y se hace uso de la palabra reservada "super"
    public Arbol(String variedad, String tipoTronco, double radioTronco, String color, String tipoHojas,
                 String nombre, double alturaTallo, boolean tieneHojas, String climaIdeal) {

        super(nombre, alturaTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;

    }


    //Métodos getters and setters
    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }

    //protected se utiliza cuando hay herencia
    //Método abstracto sobrescrito extendido de la clase madre Planta
    @Override
    protected void decirLoQueSoy() { //Si se pone el modificador de acceso a privado no puede ser un override (sobrescrito) por que en la clase madre es un metodo protegido y tambien rompe la regla de la clase abstracta de no se puede tener tipos de acceso privado
        System.out.println("Hola yo soy un ÁRBOL");

    }
}

//Si se pa
