package resueltos.guia1.ej08;

import java.util.Random;

public class Password {

    private static final int MINIMO_CAMBIAR_CONTRA = 6;
    private static final int MINIMO_SEGURIDAD = 8;
    private static final int LONGITUD_POR_DEFECTO = 10;
    private String contrasenia;

    
    /*▪ Password() {…} 
    Crea un password cuyo valor se crea automáticamente.*/
    public Password() {
        this.contrasenia = generarAleatorio(LONGITUD_POR_DEFECTO);
    }
    
    /*▪ Password(String) {…}
    Crea un password cuyo valor viene dado por parámetro.*/
    public Password(String contrasenia) {
        this();
        nuevoValor(contrasenia);
    }

    /*▪ boolean esFuerte() {…}
    Devuelve si la password es fuerte o no. Una password es fuerte cuando tenga al menos 8 caracteres.*/
    public boolean esFuerte() {
        return contrasenia.length() >= MINIMO_SEGURIDAD;
    }

    /*▪ boolean nuevoValor(String) {…}
    Establece como nuevo valor de password el recibido como parámetro, siempre y cuando su 
    longitud sea mayor o igual a 6, si no, lo deja como estaba. Devuelve si se pudo o no establecer 
    el valor.*/
    public boolean nuevoValor(String contra) {
        boolean x = false;
        if (contra.length() >= MINIMO_CAMBIAR_CONTRA) {
            this.contrasenia = contra;
            x = true;
        }
        return x;
    }

    /*▪ String generarAleatorio(int) {…}
    Devuelve una cadena que representa un valor de password aleatorio cuya longitud coincida 
    con el parámetro recibido. Si el parámetro es menor que 6, devuelve null.
    Además, deben poder crearse passwords con o sin valor inicial, por ello es que la clase contará con 
    un constructor sobrecargado: */
    private String generarAleatorio(int longitud) {
        Random rd = new Random();
        String resultado = null;
        StringBuilder contraAleatoria = new StringBuilder();
        int n; 
        
        if (longitud >= MINIMO_CAMBIAR_CONTRA) {
            for (int i = 0; i < longitud; i++) {
                n = rd.nextInt(33, 127);
                contraAleatoria.append((char) n);
            }        
            resultado = contraAleatoria.toString();
        }
        return resultado;
    }
    
    public void mostrar(){
        System.out.println(contrasenia);
    }

}