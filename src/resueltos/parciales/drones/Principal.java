package resueltos.parciales.drones;

public class Principal {
    public static void main(String[] args) {
        // Crear empresa
        Empresa empresa = new Empresa();

        // Crear cámaras
        Camara cam1 = new Camara(4);
        Camara cam2 = new Camara(8);

        // Crear drones filmadores
        DronFilmador df1 = new DronFilmador(cam1, "DF100", 100, 10, 10);
        DronFilmador df2 = new DronFilmador(cam2, "DF200", 90, 8, 6);

        // Crear drones repartidores
        DronRepartidor dr1 = new DronRepartidor(80, "DR300", 77, 7, 5);
        DronRepartidor dr2 = new DronRepartidor(60, "DR400", 85, 4, 3);

        // Crear paquetes
        Paquete p1 = new Paquete(50, 20);
        Paquete p2 = new Paquete(70, 10);
        Paquete p3 = new Paquete(90, 5);

        // Agregar drones a la empresa
        empresa.agregarDron(df1);
        empresa.agregarDron(df2);
        empresa.agregarDron(dr1);
        empresa.agregarDron(dr2);

        // Mostrar resultados de pruebas
        System.out.println(empresa.elegirDron(30, p3));
        System.out.println(empresa.elegirDron(40, 10));
        empresa.apagarDrones();
    }
}
