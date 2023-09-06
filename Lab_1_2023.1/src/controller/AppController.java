package controller;
import beans.Team;
import beans.Player;
import java.util.ArrayList;
import java.util.Scanner;
public class AppController {
    public void registrarNuevoEquipo( ArrayList<Team> EquiposGlobal){
        Scanner sc = new Scanner(System.in);
        Team team1 = new Team();
        System.out.println("Registrar Nuevo Equipo: ");
        System.out.println("---------------------------");
        bucleNombre:
        for(;;) {
            System.out.println("Nombre: ");
            team1.setNombre(sc.nextLine());
            Boolean esNuevo = true;
            for (Team equipos : EquiposGlobal) {
                if (equipos.getNombre().equals(team1.getNombre())) {
                    esNuevo = false;
                }
            }
            if (!esNuevo) {
                System.out.println("Error , ya existe el nombre");
                System.out.println("Ingrese uno nuevo");
            }else{
                break bucleNombre;
            }
        }

        System.out.println("Pais: ");
        team1.setPais(sc.nextLine());
        bucleIniciales:
        for(;;) {
            System.out.println("Iniciales: ");
            team1.setIniciales(sc.nextLine());
            if(team1.getIniciales().length() >3 ){
                System.out.println("Error, el inicial no puede tener ás de 3 caracteres");
            }else{
                break bucleIniciales;
            }
        }
        System.out.println("Estadio: ");
        team1.setEstadio(sc.nextLine());
        System.out.println("Tecnico: ");
        team1.setTecnico(sc.nextLine());
        System.out.println("Presupuesto: ");
        team1.setPresupuesto(Float.parseFloat(sc.nextLine()));
        EquiposGlobal.add(team1);
    }

    public void registrarNuevoJugador(ArrayList<Player> player1 , ArrayList<Team> team1  ){
        Scanner sc =new Scanner(System.in);
        Player playerNew = new Player();
        System.out.println("Registrar Nuevo Jugador ");
        System.out.println("--------------------------");
        if(!team1.isEmpty()) {
            System.out.println("-----Lista de Equipos ---------");
            int counter = 1;
            for (Team equipos : team1) {
                System.out.println(counter + "." + equipos.getNombre());
                counter++;
            }
            for (; ; ) {
                System.out.print("Elija un nombre de Equipo: ");
                String name = sc.nextLine();
                boolean existe = false;
                Team equipoBandera = null;
                for (Team equipos : team1) {
                    if (equipos.getNombre().equals(name)) {
                        existe = true;
                        equipoBandera = equipos;
                    }
                }
                if (!existe) {
                    System.out.println("Error , no existe equipo con ese nombre , ingrese el nombre de nuevo ");
                } else {
                    playerNew.setTeam(equipoBandera);
                    break;
                }
            }
            System.out.print("Posicion: ");
            playerNew.setPosicion(sc.nextLine());
            System.out.print("Numero de camiseta: ");
            playerNew.setNum_camiseta(Integer.parseInt(sc.nextLine()));
            System.out.println("Edad: ");
            playerNew.setEdad((sc.nextLine()));
            for(;;) {
                System.out.println("DNI: ");
                playerNew.setDNI(sc.nextLine());
                Boolean nuevoDNI = true;
                for (Player play : player1) {
                    if (play.getDNI().equals(playerNew.getDNI())) {
                        nuevoDNI = false;
                    }
                }
                if (!nuevoDNI) {
                    System.out.println("ERROR , YA EXISTE EL DNI");
                } else {
                    break;
                }
            }
            System.out.println("Salario :");
            playerNew.setSalario(Float.parseFloat(sc.nextLine()));
            player1.add(playerNew);
        }else{
            System.out.println("Primero debe registrar equipos antes de regsitrar jugadores");
            System.out.println("AUXILIO");
        }

    }

    public void listarEquipos(ArrayList<Player> player1 , ArrayList<Team> team1  ){
        for(Team equipos: team1){
            int counter= 0;
            for(Player jugador: player1){
                if(jugador.getTeam().getNombre().equals(equipos.getNombre())){
                    counter++;
                }
            }
            System.out.println(" Nombre :"+ equipos.getNombre() + "País: " + equipos.getPais() + "Iniciales: " + equipos.getIniciales() + "Estadio : " + equipos.getEstadio() + "Tecnico: " + equipos.getTecnico()+ "Presuepuesto : " + equipos.getPresupuesto() +  "Cantidad de jugadores: " + counter);
        }
    }
    public void listarJugadoresXSalario(ArrayList<Player> player1 , ArrayList<Team> team1 ){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Lista de Jugadores x salario ");
        System.out.println("------------------------------");
        System.out.println("Salario Mayor a : ");
        float salarioMin = Float.parseFloat(sc.nextLine());
        for(Player jugador: player1 ){
            if(jugador.getSalario()>salarioMin){
                System.out.println("Nombre: "+ jugador.getNombre() + "|" + "Posicion: " + jugador.getPosicion() + "|" + "Numero de camiseta : " + jugador.getNum_camiseta() + "|" + "Edad: " + jugador.getEdad() + "| DNI : " + jugador.getDNI() + "| Salario : s/." + jugador.getSalario() + " | Nombre del equipo:" + jugador.getTeam().getNombre() );
            }
        }

    }
    public void listarJugadoresXEquipo(ArrayList<Player> player1 , ArrayList<Team> team1 ){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Lista de jugadores x equipos: ");
        System.out.println("------------------------------");
        System.out.println("-----Lista de Equipos ---------");
        int counter = 1;
        for (Team equipos : team1) {
            System.out.println(counter + "." + equipos.getNombre());
            counter++;
        }
        System.out.print("Elije un nombre de equipo: ");
        String name= sc.nextLine();
        boolean existeName= false;
        for (Team equipo1: team1){
            if(equipo1.getNombre().equals(name)){
                existeName= true;
            }
        }
        if(existeName){
            for(Player jugador: player1){
                if(jugador.getTeam().getNombre().equals(name)){
                    System.out.println("Nombre: "+ jugador.getNombre() + "|" + "Posicion: " + jugador.getPosicion() + "|" + "Numero de camiseta : " + jugador.getNum_camiseta() + "|" + "Edad: " + jugador.getEdad() + "| DNI : " + jugador.getDNI() + "| Salario : s/." + jugador.getSalario() + " | Nombre del equipo:" + jugador.getTeam().getNombre() );

                }
            }
        }else{
            System.out.println("Error no existe equipo con ese nombre");
        }


    }
}
