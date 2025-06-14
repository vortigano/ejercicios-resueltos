package resueltos.guia3.ej03;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Mazo {

    private ArrayList<Carta> cartas;
    
    /**
     * Debería autogenerar las 54 cartas de la baraja inglesa
     */
    public Mazo() {
        this.cartas = new ArrayList<>();
        autoGenerarCartas();
    }
    
    private void autoGenerarCartas() {
        TipoDePalo[] palos = TipoDePalo.values();
        for (int i = 0; i < palos.length; i++) {
            cartas.add(new CartaConLetra('A', palos[i]));
            generarCartasNumericas(palos[i]);
            generarCartasConLetra(palos[i]);            
        }
        cartas.add(new Joker(false));
        cartas.add(new Joker(true));
    }
    
    /**
     * Muestra las cartas en la consola (una por renglón)
     */
    public void mostrar() {
        for (Carta carta : cartas) {
            carta.mostrar();
        }
    }    
    
    /**
     * Da vuelta todas las cartas
     */
    public void darVueltaTodas() {
        
    }
    
    /**
     * Retorna las primeras N cartas de un determinado palo en un nuevo ArrayList
     * @param tp El tipo de palo de las cartas a buscar y retornar
     * @param n El número de cartas a buscar y retornar
     * @return una lista de cartas que cumplen lo enunciado
     */
    public ArrayList<Carta> primerasNCartasSegunPalo(TipoDePalo tp, int n) {
        return null;
    }
    
    /**
     * Retorna la posición donde se encuentre el primer joker
     * @return la posición del joker (desde 0)
     */
    public int posJoker() {
        return -1;
    }
    
    /**
     * Mezcla el mazo de cartas (sin usar el método shuffle de Java)
     */
    public void mezclar() {
        
    }
    
    /**
     * Mostrar una lista de N jugadores, cada uno con sus cartas listadas
     * @param nJugadores Cuántos jugadores (por ejemplo, en el truco pueden ser 4)
     * @param cartasXJugador (Cuántas cartas recibe cada jugador (por ejemplo, en el truco son 3)
     */
    public void mostrarRepartidas(int nJugadores, int cartasXJugador) {
        
    }

    private void generarCartasNumericas(TipoDePalo palo) {
        for (int i = 2; i <= 10; i++) {
            cartas.add(new CartaConNumero(i, palo));
        }
    }

    private void generarCartasConLetra(TipoDePalo palo) {
        char[] letras = {'J', 'Q', 'K'};
        for (int i = 0; i < letras.length; i++) {
            cartas.add(new CartaConLetra(letras[i], palo));
        }
    }

}