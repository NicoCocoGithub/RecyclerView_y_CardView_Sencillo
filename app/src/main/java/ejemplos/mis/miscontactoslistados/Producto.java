package ejemplos.mis.miscontactoslistados;

/**
 * Created by nicopro on 15/5/16.
 */
public class Producto {

    private int imagen_p;
    private String nombre_p;
    private String precio_p;
    private int color_p;


    public int getColor_p() {
        return color_p;
    }


    public Producto(int imagen_p, String nombre_p, String precio_p) {
        this.imagen_p = imagen_p;
        this.nombre_p = nombre_p;
        this.precio_p = precio_p;

        this.color_p =0xFF00FF00;
    }

    public int getImagen_p() {
        return imagen_p;
    }

    public void setImagen_p(int imagen_p) {
        this.imagen_p = imagen_p;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getPrecio_p() {
        return precio_p;
    }

    public void setPrecio_p(String precio_p) {
        this.precio_p = precio_p;
    }
}
