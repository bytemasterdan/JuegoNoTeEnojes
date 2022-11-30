import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    public static void main(String args[]) {
        Colors console = new Colors();
        Scanner scanner = new Scanner(System.in);
        boolean fin = false;
        String respuesta = "s", nuevaPartida = "s";
        int index = 0;
        int cantidadJugadores = 0;
        ArrayList<Persona> jugador = new ArrayList<Persona>();
        
        console.printGreen("\nBienvenidos al Juego de No te Enojes\n");
        Tablero tablero = new Tablero();


        do{
            do{
                console.printYellow("\nIngresa el numero de Jugadores : ");
                cantidadJugadores = scanner.nextInt();

                console.printCyan("La cantidad de Jugadores es : " + cantidadJugadores);
                System.out.println();
                if(cantidadJugadores < 2|| cantidadJugadores >5){
                    console.printRed("\nLos jugadores debe ser mayor que 1 o menor que 5");
                    console.printRed("\nIntente nuevamente");
                }
            }while( cantidadJugadores < 2 || cantidadJugadores >5);
            System.out.println("\n--------------CONFIGURACION-------------");
            for(int j  = 0; j< cantidadJugadores ; j++){
                
                console.printCyan("\nPara el Jugador : " + (j+1));
                console.printYellow("\nIntrodusca el Nombre : ");
                console.printRed("");
                Persona persona = new Persona(scanner.next(),j);
                jugador.add(persona);
                console.printWhite("El nombre de la persona es : " );
                console.printBlue(jugador.get(j).nombre);

                console.printWhite("\nEl icono de la persona es : " );
                console.printCyan(jugador.get(j).getIcono());
                System.out.println();
            }

            System.out.println("\n------------Inicio de Partida-----------");
            do{
                if(respuesta.equals("s")){
                    console.printPurple("\n"+jugador.get(index).nombre);
                    console.printWhite(" desea tirar los dados s/n: ");
                    respuesta = scanner.next().toLowerCase();
                    if(respuesta.equals("n")){
                        System.out.println("Cedio Turno");
                        respuesta = "s";
                        
                    }else if(!(respuesta.equals("s")||respuesta.equals("n"))){
                        console.printRed("Caracter invalido intente nuevamente");
                        respuesta = "s";
                        index--;
                    } else{
                        jugador.get(index).avance  = tablero.tirarDados(
                                                        jugador.get(index).nombre, 
                                                        jugador.get(index).getIcono(), 
                                                        jugador.get(index).avance);
                        tablero.mostrarDatos(
                            jugador.get(index).nombre, 
                            jugador.get(index).getIcono(), 
                            jugador.get(index).avance );
                        System.out.println();
                        if(jugador.get(index).avance >= 50 ){

                            console.printCyan("\n-----------------------------------------");
                            console.printCyan( "\n       " + jugador.get(index).getIcono() + " ");
                            console.printBlue(jugador.get(index).nombre); 
                            console.printWhite(" Gana la partida!!!");
                            console.printCyan("\n-----------------------------------------");
                            System.out.println();
                            for(int j = 0 ; j<cantidadJugadores;j++){
                                tablero.mostrarDatos(
                                    jugador.get(j).nombre, 
                                    jugador.get(j).getIcono(), 
                                    jugador.get(j).avance);
                            }

                            console.printYellow("\n\nNueva Partida? s/n: ");
                            nuevaPartida = scanner.next();

                            if(nuevaPartida.equals("s")){
                                jugador.clear();
                                index = 0 ;
                                respuesta = "s";
                                break;
                            }else fin = true;
                            
                        }
                    }
                }
                if(index == cantidadJugadores -1 && !fin){
                    index = 0;
                    console.printCyan("-----------------------------------------");
                }else index++;
            }while(!fin);
        }while(nuevaPartida.equals("s"));

        console.printCyan("\n-----------------------------------------");
        console.printRed("\n             Fin del Juego");
        console.printCyan("\n-----------------------------------------");
        System.out.println();
        scanner.close();

    }
}