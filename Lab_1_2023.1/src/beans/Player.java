package beans;
public class Player {
    private String nombre = "?";
    private String posicion = "?";
    private Integer num_camiseta;
    private String edad = "?";
    private Float salario;
    private String DNI = "?";
    private Team team;




    //GETTES AND SETTERS;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getNum_camiseta() {
        return num_camiseta;
    }

    public void setNum_camiseta(Integer num_camiseta) {
        this.num_camiseta = num_camiseta;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
