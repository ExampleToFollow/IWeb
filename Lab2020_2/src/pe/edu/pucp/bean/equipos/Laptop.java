package equipos;
import java.util.Scanner;
public class Laptop {
    private String marca;
    private String modelo;
    private String tamanoPantalla;
    private String procesador;
    private String tamanoDisco;
    private Integer cantidadMemoria;
    private String sistemaOperativo;

    public void registro(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la Marca:");
        this.setMarca(sc.nextLine());
        System.out.print("Ingrese el modelo:");
        this.setModelo(sc.nextLine());
        System.out.print("Ingrese el procesador:");
        this.setProcesador(sc.nextLine());
        System.out.print("Ingrese el SO: ");
        this.setSistemaOperativo(sc.nextLine());
        System.out.print("Tamano del DISCO(GB): ");
        this.setTamanoDisco(sc.nextLine());
        System.out.print("Tamano de Memoria (GB): ");
        this.setCantidadMemoria(Integer.parseInt(sc.nextLine()));
    }

    public void reporte(){
        if(this.getMarca() != null) {
            System.out.println("|        Laptop        |");
            System.out.println("Marca :" + this.getMarca());
            System.out.println("Modelo:" + this.getModelo());
            System.out.println("Procesador: " + this.getProcesador());
            System.out.println("Sistema Operativo: " + this.getSistemaOperativo());
            System.out.println("Tamano de Disco(GB) : " + this.getTamanoDisco());
            System.out.println("Tamano de Memoria (GB): " + this.getCantidadMemoria());
            System.out.println("-------------------------------------------");
        }
    }


    //GETTERS AND SETTERS
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTamanoPantalla() {
        return tamanoPantalla;
    }
    public void setTamanoPantalla(String tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public String getTamanoDisco() {
        return tamanoDisco;
    }
    public void setTamanoDisco(String tamanoDisco) {
        this.tamanoDisco = tamanoDisco;
    }
    public Integer getCantidadMemoria() {
        return cantidadMemoria;
    }
    public void setCantidadMemoria(Integer cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}
