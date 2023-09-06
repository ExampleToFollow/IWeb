package bean;
import equipos.Celular;
import equipos.Laptop;
public class Estudiante{
    private String nombre;
    private String apellido;
    private String carrera;
    private String codigoPUCP;
    private String cicloIngreso;
    private Laptop laptop;
    private Celular celular;
















    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCodigoPUCP() {
        return codigoPUCP;
    }
    public void setCodigoPUCP(String codigoPUCP) {
        this.codigoPUCP = codigoPUCP;
    }
    public String getCicloIngreso() {
        return cicloIngreso;
    }
    public void setCicloIngreso(String cicloIngreso) {
        this.cicloIngreso = cicloIngreso;
    }
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public Celular getCelular() {
        return celular;
    }
    public void setCelular(Celular celular) {
        this.celular = celular;
    }
}
