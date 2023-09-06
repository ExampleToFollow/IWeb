import java.util.ArrayList;
import java.util.Scanner;
public class AppController {

    public void resgistrarNuevoEquipo(ArrayList<Equipo> EquipoGlobal){
        Scanner sc=  new Scanner(System.in);
        Equipo equipo= new Equipo();
        System.out.println("Registrar Nuevo Equipo" );
        System.out.println("--------------------------------");
        System.out.print("Marca: ");
        equipo.setMarca(sc.nextLine());
        System.out.print("Tipo: ");
        equipo.setTipo(sc.nextLine());
        System.out.print("Cantidad de puertos :");
        equipo.setCantidadDePuertos(Integer.parseInt(sc.nextLine()));
        System.out.println("Costo: ");
        equipo.setCosto(Float.parseFloat(sc.nextLine()));
        System.out.print("Numero de serie :");
        String numeroStr =  sc.nextLine();
        Integer numero =  Integer.parseInt(numeroStr);
        boolean numeroEsNuevo = true;
        for( Equipo equip: EquipoGlobal){
            if(Integer.parseInt(equip.getNumeroDeSerie()) == numero){
                numeroEsNuevo= false;
            }
        }
        if(numeroEsNuevo){
            equipo.setNumeroDeSerie(numeroStr);
            EquipoGlobal.add(equipo);
        }else{
            System.out.println("\"Error ,ya existe el numero de serie\"");
        }

    }
    public void registrarNuevoTecnico(ArrayList<Tecnico> TecnicoGlobal){
        Scanner sc =  new Scanner(System.in);
        Tecnico tec = new Tecnico();
        System.out.println("Registrar Nuevo Tecnico");
        System.out.println("-----------------------");
        System.out.print("Nombre: ");
        tec.setNombre(sc.nextLine());
        System.out.print("Apellidos: ");
        tec.setApellido(sc.nextLine());
        System.out.print("DNI: ");
        tec.setDni(sc.nextLine());
        boolean dniNuevo= true;
        for(Tecnico tecnico:TecnicoGlobal){
            if(tec.getDni().equals(tecnico.getDni())){
                dniNuevo= false;
            }
        }
        if(dniNuevo) {
            System.out.print("Edad: ");
            tec.setEdad(sc.nextLine());
            System.out.print("Telefono: ");
            tec.setEdad(sc.nextLine());
            System.out.print("Salario : ");
            tec.setSalario(Float.parseFloat(sc.nextLine()));
            System.out.print("Cargo : ");
            tec.setCargo(sc.nextLine());
        }else{
            System.out.println("\"Error , ya existe el Dni\"");
        }
    }

    public void listarEquipos(ArrayList<Equipo> EquipoGlobal){
        System.out.println("Los equipos son los siguientes");
        int counter = 1;
        for( Equipo equipo: EquipoGlobal){
            System.out.println(counter + " ° EQUIPO ");
            System.out.println("Marca: " + equipo.getMarca());
            System.out.println("Tipo : " + equipo.getTipo());
            System.out.println("Cantidad de Puertos: " +  equipo.getCantidadDePuertos());
            System.out.println("Numero de serie: " +  equipo.getNumeroDeSerie());
            System.out.println("Costo: " +  equipo.getNumeroDeSerie());
            System.out.println("--------------");
        }
    }
    public void listarTecnicosXSalario(ArrayList<Tecnico> TecnicoGlobal){
        Scanner sc = new Scanner(System.in);
        System.out.println("Listar Tecnicos X Salario: ");
        System.out.println("------------------------------");
        System.out.print("Ingrese el salario minimo: ");
        float salario = Float.parseFloat(sc.nextLine());
        for (Tecnico tecnico: TecnicoGlobal){
            if ( tecnico.getSalario()> salario ){
                System.out.println("Nombre: " + tecnico.getNombre());
                System.out.println("Apellido : " + tecnico.getApellido());
                System.out.println("DNI: " +  tecnico.getDni());
                System.out.println("Edad: " +  tecnico.getEdad());
                System.out.println("Salario: " +  tecnico.getSalario());
                System.out.println("Cargo : " + tecnico.getCargo());
                System.out.println("--------------");
            }
        }
    }

}
