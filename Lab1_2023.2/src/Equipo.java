public class Equipo {
    private String marca;
    private String tipo;
    private Integer cantidadDePuertos;
    private String NumeroDeSerie;
    private Float costo;





    //GETTERS AND SETTERS;
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidadDePuertos() {
        return cantidadDePuertos;
    }

    public void setCantidadDePuertos(Integer cantidadDePuertos) {
        this.cantidadDePuertos = cantidadDePuertos;
    }

    public String getNumeroDeSerie() {
        return NumeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        NumeroDeSerie = numeroDeSerie;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }
}
