package  equipos;
import java.util.Scanner;

public class Celular {
    private String marca;
    private String modelo;
    private String color;
    private Integer cantidadMemoria;
    private String sistemaOperativo;

    public void registro(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la Marca:");
        this.setMarca(sc.nextLine());
        System.out.print("Ingrese el modelo:");
        this.setModelo(sc.nextLine());
        System.out.print("Ingrese el SO: ");
        this.setSistemaOperativo(sc.nextLine());
        System.out.print("Tamano de Memoria (GB): ");
        this.setCantidadMemoria(Integer.parseInt(sc.nextLine()));
        System.out.print("Tamano de Color: ");
        this.setColor(sc.nextLine());
    }
    public void reporte(){
        if(this.getMarca() != null){
            System.out.println("|        Celular        |");
            System.out.println("Marca :" + this.getMarca());
            System.out.println("Modelo:" + this.getModelo());
            System.out.println("Sistema Operativo: " + this.getSistemaOperativo());
            System.out.println("Cantidad de Memoria (GB): " + this.getCantidadMemoria());
            System.out.println("Color : " + this.getColor());
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
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
