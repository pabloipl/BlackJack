import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Blackjack {
    public static void main(String[] args){
        barajar(crearBaraja());
    }
    public static void jugar(){}

    public static String[][] crearBaraja(){
        var pintas = new String[]{"Corazón","Diamante", "Trébol", "Pica"};
        var numerosCartas= new String[]{"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Jota","Quina","Kaiser"};

        return new String[][]{pintas,numerosCartas};
    }

    public static String [] crearMano(){
        return new String[2];
    }

    public static void barajar(String [][] baraja){
        List<String[]> list= Arrays.asList(baraja);
        Collections.shuffle(list);
        list.toArray(baraja);
        System.out.print(Arrays.toString(baraja));

    }

    public static void repartir(String[][] baraja, String[] mano){
    }

    public static void pedirCarta(String[][] baraja, String[] mano){}

    public static void bajarse(String[] manoJugador, String[] manoDealer){

    }

    public static boolean sePasoDe21(String[] mano){

    }

    public static boolean esBlackJack(String[] mano){

    }

    public static boolean verGanador(String[] manoJugador, String[] manoDealer){

    }

    public static void mostrarMenu(){

    }


}
