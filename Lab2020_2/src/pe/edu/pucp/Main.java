package pe.edu.pucp;
import bean.Estudiante;
import equipos.Celular;
import equipos.Laptop;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante1 = new Estudiante();
        ControlEstudiante control = new ControlEstudiante();
        Celular cel = new Celular();
        Laptop lap = new Laptop();
        estudiante1.setCelular(cel);
        estudiante1.setLaptop(lap);

        bucle_superior:
        for(;;){
        System.out.println("********************************");
        System.out.println("|     Menu                     |");
        System.out.println("|1<-Registrar Estudiante       |");
        System.out.println("|2<-Informacion Registrada     |");
        System.out.println("|3<-Borrar Registro estudiante |");
        System.out.println("|4<-Calculo de Nota            |");
        System.out.println("|9<-Salir                      |");
        System.out.println("********************************");
        System.out.print("Ingrese opcion");
        int opcion = Integer.parseInt(sc.nextLine());
        switch (opcion) {
            case 1:
                System.out.println("Registrar Estudiante");
                control.registrarEstudiante(estudiante1);
                break;
            case 2:
                System.out.println("Informacion Registrada");
                control.verEstudiante(estudiante1);
                break;
            case 3:
                System.out.println("Borrar Registro estudiante");
                control.borrarEstudiante(estudiante1);
                break;
            case 4:
                System.out.println("Calculo de Nota");
                System.out.println("------------------------");
                System.out.println("-- Calculo de Nota del Curso --");
                System.out.print("Nota EF: ");
                int EF= Integer.parseInt(sc.nextLine());
                System.out.print("Nota TA: ");
                int TA= Integer.parseInt(sc.nextLine());
                System.out.print("Nota PB: ");
                int PB= Integer.parseInt(sc.nextLine());
                System.out.println("Nota del curso:" + Tools.notaCurso(EF,TA,PB));
                break;
            case 9:
                System.out.println("---Cerrando el programa---");
                break bucle_superior;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }

    }


    }
}