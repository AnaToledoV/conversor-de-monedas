import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaMoneda consulta = new ConsultaMoneda();
        Scanner lectura = new Scanner(System.in);
        while (true) {
            System.out.println(
                    """
                            **********************************************************
                            Sea bienvenido al Conversor de Monedas =]
                            
                            1) Dólar =>>> Peso argentino
                            
                            2) Peso argentino =>> Dólar
                            
                            3) Dólar =>> Real brasileño
                            
                            4) Real brasileño =>> Dólar
                            
                            5) Dólar =>> Peso colombiano
                            
                            6) Peso colombiano =>> Dólar
                            
                            7) Salir
                            
                            Elija una opción válida:
                            *********************************************************""");

            String eleccion = lectura.nextLine();
            if (eleccion.equals("7")) {
                break;
            }

            System.out.println("Ingrese el valor a convertir:");
            double valor = lectura.nextDouble();
            lectura.nextLine();
            double resultado;

            switch (eleccion) {
                case "1":
                    resultado = consulta.buscaDivisas("USD", "ARS", valor);
                    System.out.println(valor + " USD equivalen a " + resultado + " ARS");
                    break;
                case "2":
                    resultado = consulta.buscaDivisas("ARS", "USD", valor);
                    System.out.println(valor + " ARS equivalen a " + resultado + " USD");
                    break;
                case "3":
                    resultado = consulta.buscaDivisas("USD", "BRL", valor);
                    System.out.println(valor + " USD equivalen a " + resultado + " BRL");
                    break;
                case "4":
                    resultado = consulta.buscaDivisas("BRL", "USD", valor);
                    System.out.println(valor + " BRL equivalen a " + resultado + " USD");
                    break;
                case "5":
                    resultado = consulta.buscaDivisas("USD", "COP", valor);
                    System.out.println(valor + " USD equivalen a " + resultado + " COP");
                    break;
                case "6":
                    resultado = consulta.buscaDivisas("COP", "USD", valor);
                    System.out.println(valor + " COP equivalen a " + resultado + " USD");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        lectura.close();
    }
}
