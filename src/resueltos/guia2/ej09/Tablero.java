
package resueltos.guia2.ej09;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Tablero {
    
    /*
        COMPLETAR CLASE TABLERO SEGUN LO ENUNCIADO
    */
    
    private ArrayList<Llave> llaves;

    public boolean tenesLlaveConEstaPatente(String patente) {
        return buscarLlave(patente) != null;
    }

    private Llave buscarLlave(String patente) {
        Llave llaveEncontrada = null;
        int i = 0;
        while(i < llaves.size() && !llaves.get(i).getPatente().equals(patente)) {    
            i++;
        }
        if (i < llaves.size()) {
            llaveEncontrada = llaves.get(i);
        }
        return llaveEncontrada;
    }

}
