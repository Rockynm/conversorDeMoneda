import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;
import Datos.Monedero;
import Métodos.Canal;
import Métodos.Capacitor;

public class Principal {
    public static void main(String[] args) throws Exception {

        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Elige una opción");
        System.out.println("1) Soles a Dólares");
        System.out.println("2) Dólares a Soles");
        System.out.println("3) Pesos MX a Dólares");
        System.out.println("4) Dólares a Pesos MX");
        System.out.println("5) Pesos ARG a Dólares");
        System.out.println("6) Dólares a Pesos ARG");
        System.out.println("7) Euros a Dólares");
        System.out.println("8) Dólares a Euros");
        System.out.println("9) Salir");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try {
            Scanner scanner = new Scanner(System.in);
            int eleccion = scanner.nextInt();
            scanner.nextLine();
            scanner.close();
            System.out.println("Genial 1");
        } catch (Exception e)  {
            System.out.println("EORRRRR");
        }
            

        //Generación e la onsulta para obetner los valores de las monedas

        try {
            String direccionApi = "https://v6.exchangerate-api.com/v6/ba150d0ba9c23dd4559092f6/latest/USD";

            Canal consulta = new Canal();
            consulta.crearConsulta(direccionApi);
            System.out.println("Exito en la consulta");

        } catch (Exception e) {
            System.out.println("DIABLOSSSS");
        }

        
        //
        String json = "{valor vacio}";
        Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();
        Capacitor valores = gson.fromJson(json, Capacitor.class);
        Monedero monedas = new Monedero(valores);





            System.out.println(monedas.getPEN());

            //generarConsulta();

            //Inicio de IF
            /*switch (eleccion) {
                case 1:
                    System.out.println("Switch reportándose");
                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                case 8:

                case 9:
            };*/



        
    }
}
