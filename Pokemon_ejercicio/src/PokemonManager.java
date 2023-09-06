import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class PokemonManager {
    //ATRIBUTOS
    //ArrayList; .get .add
    private ArrayList<Pokemon> bolsa = new ArrayList<>() ;
    //ArregloFijo; []
    private Pokemon[] pokedex = new Pokemon[150];
    private  Integer contadorBolsa = 0;
    private Integer contadorPokedex = 0;
    //METODOS
    public void capturarPokemon(){
        Pokemon poke =new Pokemon();
        Scanner sc = new Scanner(System.in);
        String[] tipos = {"agua", "bicho","dragon", "planta", "fuego", "otro"};
        System.out.println("Ingrese la informacion del Pokemon:");
        System.out.print("Numero: ");
        poke.setNumero(Integer.parseInt(sc.nextLine()));
        System.out.print("Nombre: ");
        poke.setNombre(sc.nextLine());
        System.out.println("Seleccione el tipo:");
        for(int i =0  ; i<tipos.length ; i++){
            System.out.println("" + (i+1) + tipos[i]);
        }
        System.out.print("Opcion: ");
        int opcion = Integer.parseInt(sc.nextLine());
        if(opcion==6){
            System.out.print("Ingrese el nuevo tipo:");
            poke.setTipo(sc.nextLine());
        }else{
            poke.setTipo(tipos[opcion-1]);
        }
        System.out.println("Peso:");
        poke.setPeso(Double.parseDouble(sc.nextLine()));
        System.out.println("Altura:");
        poke.setAltura(Double.parseDouble(sc.nextLine()));
        System.out.println("PS:");
        poke.setPs(Integer.parseInt(sc.nextLine()));
        System.out.println("** Se registro nuevo pokemon**");
        this.registrarPokedex(poke);
    }
    public void registrarPokedex(Pokemon poke){
        Boolean esNuevo = true;
        for(int idx =0 ; idx<this.getContadorPokedex()-1 ;idx++){
            if(this.getPokedex()[idx].getNumero() == poke.getNumero() ){
                if(this.getPokedex()[idx].getPs()<poke.getPs()){
                    this.getPokedex()[idx] = poke;
                }
                esNuevo=false;
                break;
            }
        }
        if(esNuevo){
            this.getPokedex()[this.getContadorPokedex()]=poke;
            this.setContadorPokedex(getContadorPokedex()+1);
        }
        this.getBolsa().add(poke);
        this.setContadorBolsa(this.getContadorBolsa()+1);
    }

    public void listarPokemon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione Lista: ");
        System.out.println("1.Bolsa ");
        System.out.println("2.pokedex ");
        System.out.print("Opcion: ");
        int opcion = Integer.parseInt(sc.nextLine());
        switch(opcion){
            case 1:
                //Bolsa
                System.out.println("Pokemon en Bolsa : "+  (this.getContadorBolsa()));
                for(Pokemon pok : this.getBolsa()){
                    pok.imprimir();
                }
                break;
            case 2:
                //Pokedex
                System.out.println("Pokemon en pokedex: "+ (this.getContadorPokedex()));
                for(int j=0 ; j < this.getContadorPokedex(); j++ ){
                    this.getPokedex()[j].imprimir();
                }
                break;
        }
    }

    public void buscarPokemon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la lista:");
        System.out.println("1. Bolsa ");
        System.out.println("2. Pokedex ");
        System.out.print("Opcion: ");
        Integer opcion = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el nombre del Pokemon a buscar: ");
        String pokemon = sc.nextLine().toLowerCase();
        switch(opcion){
            case 1:
                //Bolsa
                for(Pokemon poke1 : this.getBolsa()){
                    if(pokemon.equals(poke1.getNombre().toLowerCase())){
                        poke1.imprimir();
                    }
                }
                break;
            case 2:
                //Pokedex
                for(int idx =0;idx<this.getContadorPokedex() ;idx++){
                    if(pokemon.equals(this.getPokedex()[idx].getNombre().toLowerCase())){
                        this.getPokedex()[idx].imprimir();
                    }
                }
                break;
        }


    }
    public void imprimirResumen(){
        System.out.println("Tiene " + this.getContadorBolsa() + "Pokemon en Bolsa");
        System.out.println("Tiene " + this.getContadorPokedex() + "Pokemon en Pokedex");
    }

    //GETTERS AND SETTERS
    public ArrayList<Pokemon> getBolsa() {
        return bolsa;
    }
    public void setBolsa(ArrayList<Pokemon> bolsa) {
        this.bolsa = bolsa;
    }
    public Pokemon[] getPokedex() {
        return pokedex;
    }
    public void setPokedex(Pokemon[] pokedex) {
        this.pokedex = pokedex;
    }
    public Integer getContadorBolsa() {
        return contadorBolsa;
    }
    public void setContadorBolsa(Integer contadorBolsa) {
        this.contadorBolsa = contadorBolsa;
    }
    public Integer getContadorPokedex() {
        return contadorPokedex;
    }
    public void setContadorPokedex(Integer contadorPokedex) {
        this.contadorPokedex = contadorPokedex;
    }
}
