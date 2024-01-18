
public class Flor extends Planta {

    private String colorPetalos;
    private String colorPistilo;
    private int cantPromedioPetalos;
   
    private String variedadFlor;
    private String estacion;

    public Flor() {
    }

    public Flor(String colorPetalos, String colorPistilo, double cantPromedioPetalos, String variedadFlor, String estacion, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.colorPistilo = colorPistilo;
        this.cantPromedioPetalos = (int) cantPromedioPetalos;
        this.variedadFlor = variedadFlor;
        this.estacion = estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public double getCantPromedioPetalos() {
        return cantPromedioPetalos;
    }

    public void setCantPromedioPetalos(double cantPromedioPetalos) {
        this.cantPromedioPetalos = (int) cantPromedioPetalos;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    
    
    
    @Override
    public void decirLoQueSoy() { //metodo publico que si puede verse reflejado en el main al correr el codigo
        System.out.println("Hola soy una Flor");
    }
    
}
