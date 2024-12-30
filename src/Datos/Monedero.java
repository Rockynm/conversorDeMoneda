package Datos;
import Métodos.Capacitor;

public class Monedero {
    private int USD;
    private int PEN;
    private int MXN;
    private int ARS;
    private int EUR;


    public Monedero(Capacitor valor) {
        this.USD = valor.USD();
        this.PEN = valor.PEN();
        this.MXN = valor.MXN();
        this.ARS = valor.ARS();
        this.EUR = valor.EUR();
    }

    // Getters y Setters
    public int getUSD(){
        return USD;
    }
    public int getPEN(){
        return PEN;
    }
    public int getMXN(){
        return MXN;
    }
    public int getARS(){
        return ARS;
    }
    public int getEUR(){
        return EUR;
    }
}
