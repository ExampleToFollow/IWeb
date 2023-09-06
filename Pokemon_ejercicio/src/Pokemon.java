public class Pokemon {

    private Integer numero;
    private String nombre;
    private String tipo;
    private Double peso;
    private Double altura;
    private Integer ps;

    public void imprimir(){
        System.out.println("*************************");
        System.out.println("numero : " + this.getNumero());
        System.out.println("NOmbre: " + this.getNombre());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("peso: " + this.getPeso());
        System.out.println("altura: " + this.getAltura());
        System.out.println("ps: " + this.getPs());
        System.out.println("********************************");
    }
    //GETTERS AND SETTERS
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getPs() {
        return ps;
    }

    public void setPs(Integer ps) {
        this.ps = ps;
    }
}
