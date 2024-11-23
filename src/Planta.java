//Clase abstracta madre Planta
//Una clase abstracta no puede instanciar objetos directamente solo sus clases hijas
//Pueden tener metodos abstractos y metodos no abstractos
public abstract class Planta {

    //Atributos (características)
    private String nombre;
    private double alturaTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    //Constructores
    public Planta(){

    }

    public Planta(String nombre, double alturaTallo, boolean
            tieneHojas, String climaIdeal){
        this.nombre = nombre;
        this.alturaTallo = alturaTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    //Métodos getters and setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Double getAlturaTallo() {
        return alturaTallo;
    }

    public void setAlturaTallo(double alturaTallo) {
        this.alturaTallo = alturaTallo;
    }

    public boolean getTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }


    //Metodo abstracto que debe de tener una clae abstracta como minimo 1
                    //Tipo de dato que arroja el método abstracto.
    //Una clase abstracta no puede tener tipo de acceso (private)
    protected abstract void decirLoQueSoy();
}
