import beans.Player;
import beans.Team;
import controller.AppController;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Team> EquiposGlobal = new ArrayList<Team>() ;
        ArrayList<Player> player1 = new ArrayList<Player>();
        AppController app = new AppController();
        Scanner sc = new Scanner(System.in);
        bucleSupreme:
        for (;;) {
            System.out.println("*********************************");
            System.out.println("|      Menu                      |");
            System.out.println("|1<- registrat Nuevo Equipo      |");
            System.out.println("2<- Registrar Nuevo Jugador      |");
            System.out.println("3<- Lista de Jugadores x salario |");
            System.out.println("4<- Lista de equipos              |");
            System.out.println("5<- Lista de Jugadores x equipo   |");
            System.out.println("9<- salir");
            int opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1:
                    //Resgitrar Nuevo Equipo
                    System.out.println("Registrar Nuevo Equipo ");
                    app.registrarNuevoEquipo(EquiposGlobal);
                    break;
                case 2:
                    //Registrar Nuevo Jugador
                    System.out.println("Registrar Nuevo Jugador ");
                    app.registrarNuevoJugador(player1 ,  EquiposGlobal  );
                    break;
                case 3:
                    //Lista de jugadores x salario
                    System.out.println("Lista de jugadores x salario ");
                    app.listarJugadoresXSalario(player1 , EquiposGlobal );
                    break;
                case 4:
                    //Lista de equipos
                    System.out.println("Lista de Equipos");
                    app.listarEquipos( player1 , EquiposGlobal  );
                    break;
                case 5:
                    //Lista de jugadores por equipo;
                    app.listarJugadoresXEquipo(player1 , EquiposGlobal );
                    //QUIZAS NO LO HAGAS
                    break;
                case 9:
                    System.out.println("---- Cerrando Programa------");
                    break  bucleSupreme;
                default :
                    System.out.println("Ingrese una opcion valida ");
                    break;
            }
        }
    }
}