package resueltos.guia3.ej09;

public class Principal {

    public static void main(String[] args) {
        Comercio a = new Comercio();
        
        // Servicios de armado
        
        a.realizarServicio(new ServicioDeArmado(2)); 
        a.realizarServicio(new ServicioDeArmado(3)); 
        a.realizarServicio(new ServicioDeArmado(1)); 
        a.realizarServicio(new ServicioDeArmado(4)); 
        a.realizarServicio(new ServicioDeArmado(1)); 
        a.realizarServicio(new ServicioDeArmado(2)); 
        a.realizarServicio(new ServicioDeArmado(3)); 
        a.realizarServicio(new ServicioDeArmado(1)); 
        a.realizarServicio(new ServicioDeArmado(2)); 
        a.realizarServicio(new ServicioDeArmado(2)); 
        
        // Servicios de reparacion
        
        a.realizarServicio(new ServicioDeReparacion(1, 2)); 
        a.realizarServicio(new ServicioDeReparacion(2, 3)); 
        a.realizarServicio(new ServicioDeReparacion(3, 4)); 
        a.realizarServicio(new ServicioDeReparacion(1, 1)); 
        a.realizarServicio(new ServicioDeReparacion(2, 3)); 
        a.realizarServicio(new ServicioDeReparacion(1, 2)); 
        a.realizarServicio(new ServicioDeReparacion(2, 3)); 
        a.realizarServicio(new ServicioDeReparacion(3, 5)); 
        a.realizarServicio(new ServicioDeReparacion(1, 2)); 
        a.realizarServicio(new ServicioDeReparacion(2, 3)); 
        
        // Insumos
        
        a.realizarServicio(new Insumo("Spray Limpiador", 30, 8.50, TipoDeInsumo.LIMPIEZA));
        a.realizarServicio(new Insumo("SSD Kingston 500GB", 15, 65.00, TipoDeInsumo.HARDWARE));
        a.realizarServicio(new Insumo("Mouse Gamer Logitech", 25, 45.00, TipoDeInsumo.PERIFERICO));
        a.realizarServicio(new Insumo("Pasta Térmica Arctic MX-4", 40, 6.00, TipoDeInsumo.LIMPIEZA));
        a.realizarServicio(new Insumo("Memoria RAM 8GB DDR4", 18, 35.00, TipoDeInsumo.HARDWARE));
        a.realizarServicio(new Insumo("Teclado Mecánico RGB", 20, 80.00, TipoDeInsumo.PERIFERICO));
        a.realizarServicio(new Insumo("Paño de Microfibra", 50, 2.00, TipoDeInsumo.LIMPIEZA));
        a.realizarServicio(new Insumo("Fuente de Poder 650W", 12, 75.00, TipoDeInsumo.HARDWARE));
        a.realizarServicio(new Insumo("Monitor 24 pulgadas IPS", 10, 150.00, TipoDeInsumo.PERIFERICO));
        a.realizarServicio(new Insumo("Kit de Limpieza para Pantallas", 35, 10.00, TipoDeInsumo.LIMPIEZA));
        
        // Pruebas
        
        System.out.println("*****************************");
        
        a.montoTotalFacturado();
        
        System.out.println("*****************************");
        
        a.cantidadServiciosSimples();
        
        System.out.println("*****************************");
    }
}
