package pe.edu.pucp;
import bean.Estudiante;
import java.util.Scanner;
public class ControlEstudiante {
    //OPCION1
    public void registrarEstudiante(Estudiante estudiante1){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------");
        if(estudiante1.getCodigoPUCP() == null && estudiante1.getNombre() == null && estudiante1.getApellido()==null && estudiante1.getCarrera()==null ){
            System.out.print("Ingrese Codigo PUCP: ");
            estudiante1.setCodigoPUCP(sc.nextLine());
            System.out.print("Ingrese Nombre:");
            estudiante1.setNombre(sc.nextLine());
            System.out.print("Ingrese Apellido:");
            estudiante1.setApellido(sc.nextLine());
            System.out.print("Ingrese Carrera:");
            estudiante1.setCarrera(sc.nextLine());
            System.out.print("Tienes Laptop ?(Sí/No)");
            String rpta = sc.nextLine();
            if(rpta.equals("Sí")){
                System.out.println("--Computadora--");
                estudiante1.getLaptop().registro();
            }
            System.out.print("Tienes celular? (Sí/No)");
            rpta = sc.nextLine();
            if (rpta.equals("Sí")){
                System.out.println("--Celular---");
                estudiante1.getCelular().registro();
            }


        }else{
            System.out.println("Ya se registro un estudiante");
            System.out.println("********************************");
        }
        }
    //OPCION 2
    public void verEstudiante(Estudiante estudiante1){
        if(estudiante1.getCodigoPUCP() == null && estudiante1.getNombre() == null && estudiante1.getApellido()==null && estudiante1.getCarrera()==null){
            System.out.println("No se tiene registrado un estudiante ");

        }else{
            System.out.println("Información registrada");
            System.out.println("**********************");
            System.out.println("*Informacion del estudiante*");
            System.out.println("----------------------------");
            System.out.println("Alumno de codigo:" + estudiante1.getCodigoPUCP());
            System.out.println("Nombre: " + estudiante1.getNombre());
            System.out.println("Apellido: "+ estudiante1.getApellido());
            System.out.println("**************************************");
            estudiante1.getLaptop().reporte();
            estudiante1.getCelular().reporte();
        }
    }

    public void borrarEstudiante(Estudiante estudiante1){
        estudiante1.setNombre(null);
        estudiante1.setCodigoPUCP(null);
        estudiante1.setApellido(null);
        estudiante1.setCarrera(null);
        System.out.println("Borrar Registro de Estudiante");
        System.out.println("-----------------------------");
        System.out.println("Borrado del Registro de Estudiante Completado");

    }
}
