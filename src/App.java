import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import clases.GestorDeMonedas;
import clases.RetenedorDeValores;
import utilidades.ConvertidorDeMonedas;

public class App {
    public static void main(String[] args) throws Exception {



        /* //Paso 1, Prints
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
        
        // Paso 2, Elegir una opción y asignar monto
        Scanner scanner = new Scanner(System.in);
        int numeroElegido = scanner.nextInt();
        scanner.nextLine();
        int cantidadDelUsuario = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        System.out.println(numeroElegido); //

        GestorDeMonedas gestor = new GestorDeMonedas();
        gestor.setDolar(numeroElegido);
        System.out.println(gestor.getDolar()); //

        // Paso 3, Conectar a la "base de datos"
        String direccion = "https://v6.exchangerate-api.com/v6/ba150d0ba9c23dd4559092f6/latest/USD";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json); //

        // Paso 4, Almacenar los datos en el RetenedorDeValores
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        // Núcleo complejo - Función: extraer la parte de "conversion_rates" del JSON
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        // Solo cambia el enfoque, que ahora serán los valores de conversion_rates
        RetenedorDeValores miRetenedorDeValores = gson.fromJson(conversionRates, RetenedorDeValores.class);
        System.out.println(miRetenedorDeValores); //

        GestorDeMonedas miGestorDeMonedas = new GestorDeMonedas(miRetenedorDeValores);
        System.out.println(miGestorDeMonedas); //
        System.out.println(json); //

        // Paso 5, Convertir las monedas exitosamente
        ConvertidorDeMonedas miConvertidorDeMonedas = new ConvertidorDeMonedas();
        double resultado = miConvertidorDeMonedas.convierteMoneda(cantidadDelUsuario, miGestorDeMonedas.getSol(), miGestorDeMonedas.getPesomx());
        System.out.println(resultado); //  */

        Scanner scanner = new Scanner(System.in);

        while(true){
            // Código que arrancará sí o sí
            //Paso 1, Prints
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
        
        // Paso 2, Elegir una opción y asignar monto
        /*Scanner scanner = new Scanner(System.in);*/
        int numeroElegido = scanner.nextInt();
        scanner.nextLine();
        //System.out.println(numeroElegido); //

        GestorDeMonedas gestor = new GestorDeMonedas();
        gestor.setDolar(numeroElegido);
        //System.out.println(gestor.getDolar()); //

        // Paso 3, Conectar a la "base de datos"
        String direccion = "https://v6.exchangerate-api.com/v6/ba150d0ba9c23dd4559092f6/latest/USD";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        //System.out.println(json); //

        // Paso 4, Almacenar los datos en el RetenedorDeValores
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        // Núcleo complejo - Función: extraer la parte de "conversion_rates" del JSON
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        // Solo cambia el enfoque, que ahora serán los valores de conversion_rates
        RetenedorDeValores miRetenedorDeValores = gson.fromJson(conversionRates, RetenedorDeValores.class);
        //System.out.println(miRetenedorDeValores); //

        GestorDeMonedas miGestorDeMonedas = new GestorDeMonedas(miRetenedorDeValores);
        //System.out.println(miGestorDeMonedas); //
        //System.out.println(json); //

        ConvertidorDeMonedas miConvertidorDeMonedas = new ConvertidorDeMonedas();

            if (numeroElegido == 9){
                System.out.println("Gracias por su visita");
                break;

            } else if (numeroElegido <= 8 & numeroElegido >= 1){
                System.out.println("¿Qué cantidad deseas convertir?");
                double cantidadDelUsuario = scanner.nextInt();
                scanner.nextLine();
                /*scanner.close();*/

                double resultado = 0;


                switch (numeroElegido) {
                    case 1:
                    
                        // Paso 5, Convertir las monedas exitosamente
                        resultado = miConvertidorDeMonedas.convierteMoneda(cantidadDelUsuario, miGestorDeMonedas.getSol(), miGestorDeMonedas.getDolar());

                        System.out.println("El resultado es que: " + cantidadDelUsuario + " soles" + " equivale a " + Double.toString(resultado) + " dólares."); //
                        break;

                    case 2:
                        resultado = miConvertidorDeMonedas.convierteMoneda(cantidadDelUsuario, miGestorDeMonedas.getDolar(), miGestorDeMonedas.getSol());

                        System.out.println("El resultado es que: " + cantidadDelUsuario + " dólares" + " equivale a " + Double.toString(resultado) + " soles."); //
                        break;

                    case 3:
                        resultado = miConvertidorDeMonedas.convierteMoneda(cantidadDelUsuario, miGestorDeMonedas.getPesomx(), miGestorDeMonedas.getDolar());

                        System.out.println("El resultado es que: " + cantidadDelUsuario + " pesos mexicanos" + " equivale a " + Double.toString(resultado) + " dólares."); //
                        break;

                    case 4:
                        resultado = miConvertidorDeMonedas.convierteMoneda(cantidadDelUsuario, miGestorDeMonedas.getDolar(), miGestorDeMonedas.getPesomx());

                        System.out.println("El resultado es que: " + cantidadDelUsuario + " dólares" + " equivale a " + Double.toString(resultado) + " pesos mexicanos."); //
                        break;

                    case 5:
                        resultado = miConvertidorDeMonedas.convierteMoneda(cantidadDelUsuario, miGestorDeMonedas.getPesoarg(), miGestorDeMonedas.getDolar());

                        System.out.println("El resultado es que: " + cantidadDelUsuario + " pesos argentinos" + " equivale a " + Double.toString(resultado) + " dólares."); //
                        break;

                    case 6:
                        resultado = miConvertidorDeMonedas.convierteMoneda(cantidadDelUsuario, miGestorDeMonedas.getDolar(), miGestorDeMonedas.getPesoarg());

                        System.out.println("El resultado es que: " + cantidadDelUsuario + " dólares" + " equivale a " + Double.toString(resultado) + " peso argentinos."); //
                        break;

                    case 7:
                        resultado = miConvertidorDeMonedas.convierteMoneda(cantidadDelUsuario, miGestorDeMonedas.getEuro(), miGestorDeMonedas.getDolar());

                        System.out.println("El resultado es que: " + cantidadDelUsuario + " euros" + " equivale a " + Double.toString(resultado) + " dólares."); //
                        break;

                    case 8:
                        resultado = miConvertidorDeMonedas.convierteMoneda(cantidadDelUsuario, miGestorDeMonedas.getDolar(), miGestorDeMonedas.getEuro());

                        System.out.println("El resultado es que: " + cantidadDelUsuario + " dólares" + " equivale a " + Double.toString(resultado) + " euros."); //
                        break;
                    }
                    
                } else {
                    System.out.println("Por favor, ingrese valores válidos.");
                }
            }
            scanner.close();
        }
    }

