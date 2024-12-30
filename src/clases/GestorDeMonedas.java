package clases;

import com.google.gson.annotations.SerializedName;

public class GestorDeMonedas {
    @SerializedName("USD")
    private double dolar;
    @SerializedName("PEN")
    private double sol;
    @SerializedName("MXN")
    private double pesomx;
    @SerializedName("ARS")
    private double pesoarg;
    @SerializedName("EUR")
    private double euro;

    // Constructor conectado al RetenedorDeValores
    
    public GestorDeMonedas(RetenedorDeValores valor) {
        this.dolar = valor.USD();
        this.sol = valor.PEN();
        this.pesomx = valor.MXN();
        this.pesoarg = valor.ARS();
        this.euro = valor.EUR();
    } 

    public GestorDeMonedas() {

    }

    // Getters y Setters
    public double getDolar(){
        return dolar;
    }
    public double getSol(){
        return sol;
    }
    public double getPesomx(){
        return pesomx;
    }
    public double getPesoarg(){
        return pesoarg;
    }
    public double getEuro(){
        return euro;
    }
    //
    public void setDolar(double dolar){
        this.dolar = dolar;
    }
    /*
        Easter egg del proyecto del profesor, lo pongo aquí para analizarlo después.
        @Override
        public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
        }*/
        

        @Override
        public String toString() {
            return "USD:" + dolar +
                ", PEN:" + sol +
                ", MXN:" + pesomx +
                ", ARS:" + pesoarg +
                ", EUR:" + euro;
        }
}
