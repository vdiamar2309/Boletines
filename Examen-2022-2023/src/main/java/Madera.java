public class Madera extends Juguete {

    private String color;
    private int nmroLado;


    public Madera(String nombre, String marca, String color, int nmroLado) {
        super(nombre, marca);
        this.color = color;
        this.nmroLado = nmroLado;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNmroLado() {
        return nmroLado;
    }

    public void setNmroLado(int nmroLado) {
        this.nmroLado = nmroLado;
    }











}
