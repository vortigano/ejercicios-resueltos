/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resueltos.guia1.ej03;

import java.util.Random;

/**
 *
 * @author karol
 */
public class CuentaBancaria {
    private String CBU; //CBU como string, porque 22 dígitos es imposible como dato numérico (?
    private String tipoCuenta;
    private double saldo; //Salvo que se aclare, es 0 por default.

    public CuentaBancaria(String tipoCuenta) {
        this.CBU = generarCBU();
        this.saldo = 0;
        this.tipoCuenta = tipoCuenta;
    }
   
    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
        }
        else{
            System.out.println("El monto a depositar debe ser un real positivo");
        }
    }
    
    public void extraer(double monto){
        if(monto > 0){
            if( tipoCuenta.equals("corriente") || monto <= saldo) {
                saldo -= monto;
            }
            else {
                System.out.println("Su saldo disponible no permite extraer ARS "+ monto);
            }
        } else{
            System.out.println("El monto a extraer debe ser un real positivo");
        }
        
        
    }
    
    public double getSaldoActual(){
        return saldo;
    }    
    
    public void getUltimosCBU(int cuantos){
        String ultimos = CBU.substring(CBU.length() - cuantos);
        System.out.println("Últimos " + cuantos + " dígitos del CBU: " + ultimos);
    }
    
    //agrego un método que muestre los datos ingresados en prog ppal.
    public void mostrarDatos(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "CBU=" + CBU + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo + '}';
    }

    private String generarCBU() {
        Random r = new Random();
        String elCbu = "";
        for (int i = 0; i < 22; i++) {
            elCbu += r.nextInt(10);
        }
        return elCbu;        
    }
    
    
    
}
