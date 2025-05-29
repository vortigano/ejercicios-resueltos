package resueltos.guia3.ej05;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Computadora compu = new Computadora();
        Archivo a1 = new Archivo("Genérico", 1, "C:/");
        ArchivoTexto a2 = new ArchivoTexto("UTF-8", "Hello world!" ,"Ej01", 10, "D:/Documentos");
        // No se puede: a3 = new ArchivoMultimedia(0, "", 0, "");
        ArchivoMultimedia a3 = new ArchivoAudio("", "", FormatoAudio.FLAC, 0, "", 0, ""); 
        ArchivoAudio a4 = new ArchivoAudio("Queen", "Bohemian Rapsody", FormatoAudio.MP3, 3689, "Bohemian Rapsody", 14063, "Mi música");
        ArchivoVideo a5 = new ArchivoVideo(FormatoVideo.MP4, 1920, 1080, 7263, "Terminator 2", 1569863, "Altas pelis");
        ArchivoVideo a6 = new ArchivoVideo(FormatoVideo.MKV, 800, 600, 6589, "Alien: El Octavo Pasajero", 1541268, "Altas pelis");
        
        compu.agregarArchivo(a2);
        compu.agregarArchivo(a4);
        compu.agregarArchivo(a1);
        compu.agregarArchivo(a3);
        compu.agregarArchivo(a5);
        
        compu.listar();
        System.out.println(compu.cantArchivosDeTexto());

        System.out.println("\n--- Pruebas de mover ---");
        System.out.println("Localización antes: " + a1.getLocalizacion());
        a1.mover("D:/NuevaUbicacion");
        System.out.println("Localización después: " + a1.getLocalizacion());
        
        System.out.println("\n--- Pruebas de relación de aspecto ---");
        System.out.println("Relación de aspecto de a5: " + a5.relacionDeAspecto());
        System.out.println("Relación de aspecto de a6: " + a6.relacionDeAspecto());

        System.out.println("\n--- Pruebas de cifrado ---");
        System.out.println("Texto original: " + a2.getValor());
        a2.cifrar();
        System.out.println("Texto cifrado: " + a2.getValor());
        a2.descifrar();
        System.out.println("Texto descifrado: " + a2.getValor());
    }
}