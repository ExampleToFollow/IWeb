import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<Equipo> EquipoGlobal = new ArrayList<Equipo>();
        ArrayList<Tecnico> TecnicoGlobal =  new ArrayList<Tecnico>();
        AppController app = new AppController();
        bucleSupreme:
        for(;;){
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++\n  | Menú | \n| 1 <- Registrar Nuevo Equipo |\n | 2 <- Registrar Nuevo Técnico | \n | 3 <- Listar Equipos | \n | 4 <- Listar técnicos x salario | \n | 5 <- Buscar técnico x DNI |\n | 9 <- Salir | \n ++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Ingrese opcion: ");
            int opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1:
                    app.resgistrarNuevoEquipo(EquipoGlobal);
                    //Registrar Nuevo Equipo
                    break;
                case 2:
                    app.registrarNuevoTecnico( TecnicoGlobal);
                    //Registrar Nuevo Tecnico
                    break;
                case 3:
                    app.listarEquipos(EquipoGlobal);
                    //Listar Equipos
                    break;
                case 4:
                    app.listarTecnicosXSalario(TecnicoGlobal);
                    //Listar tecnicos x salario
                    break;
                case 5:
                    //Buscat tecnico x DNI
                    break;
                case 9:
                    System.out.println("Cerrando el programa ");
                    break bucleSupreme;
                default:
                    System.out.println("ingresa otra opcion");
                    break;
            }
        }
    }
}