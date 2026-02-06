public class Juguete {
    private String nombre;
    private String Marca;

    public Juguete(String nombre, String marca) {
        this.nombre = nombre;
        Marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
}
