package resueltos.guia3.ej05;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Computadora {

    private ArrayList<Archivo> archivos;

    public Computadora() {
        this.archivos = new ArrayList<>();
    }
    
    public void agregarArchivo(Archivo unArchivo) {
        //ArchivoTexto at = (ArchivoTexto) unArchivo;
        //System.out.println(at);
        this.archivos.add(unArchivo);
    }
    
    public void listar() {
        for (Archivo archivo : archivos) {
            System.out.println(archivo);
        }
    }
    
    public void cerrarTodos() {
        for (Archivo archivo : archivos) {
            archivo.cerrar();
        }
    }

    public int cantArchivosDeTexto() {
        int cont = 0;
        for (Archivo archivo : archivos) {
            if (archivo instanceof ArchivoTexto) {
                cont++;
            }
        }
        return cont;
    }
}