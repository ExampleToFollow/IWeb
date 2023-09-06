import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de registro pokemon: ");

        PokemonManager Ash =new PokemonManager();
        bucleInfinito:
        for(;;){
            System.out.println("Indique la acción que desea realizar :");
            System.out.println("1. Capturar Pokemon ");
            System.out.println("2. Listar pokemon");
            System.out.println("3. Buscar pokemon");
            System.out.println("4. Imprimir pokemon");
            System.out.println("5. salir ");
            int opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1:
                    Ash.capturarPokemon();
                    break;
                case 2:
                    Ash.listarPokemon();
                    break;
                case 3:
                    Ash.buscarPokemon();
                    break;
                case 4:
                    Ash.imprimirResumen();
                    break;
                case 5:
                    break bucleInfinito;
            }

        }
        System.out.println("Hello world!");
    }
}