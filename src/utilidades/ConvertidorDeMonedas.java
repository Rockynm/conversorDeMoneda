package utilidades;

public class ConvertidorDeMonedas {
    
    // Por ejemplo, soles a dóalres ---  300 soles  a  dólares  (1 dólar entre / 3,47 soles creo)
    public double convierteMoneda(double cantidad,double moneda1, double moneda2){
        double valorEquitativo = moneda2 / moneda1;
        double resultado = valorEquitativo * cantidad;
        return resultado;
    }
}
