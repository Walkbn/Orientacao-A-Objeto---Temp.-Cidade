import java.util.Scanner;
public class City {
    public static void main(String[] args) {
        int selecMenu, option = 0, temperature; String cityName;
        Scanner scan = new Scanner(System.in);
        while(option==0) {
            Utilitario.pausar(4);
            menu();
            selecMenu = scan.nextInt();
            cityName = nameCity(selecMenu);
            temperature = temperature(selecMenu);
            System.out.println("A temperatura de " + cityName + " é de " + temperature + "° Graus Celsius");
            
        }
        scan.close();
    }
    public static String nameCity(int selecMenu) {
        String cityName = "";
        switch (selecMenu) {
            case 1: cityName = "Bangkok"; break;
            case 2: cityName = "Dubai"; break;
            case 3: cityName = "São Paulo"; break;
            case 4: cityName = "Nova York"; break;
            case 5: cityName = "Sydney"; break;
            case 6: cityName = "Londres"; break;
            case 7: cityName = "Moscou"; break;
            case 8: cityName = "Cidade do México"; break;
            case 9: cityName = "Tóquio"; break;
            case 10: cityName = "Cairo"; break;
        }
        return cityName;
    }
    public static void menu() {
        System.out.println("=== Temperatura de cidades ===\n Selecione a cidade que deseja:\n");
        System.out.print("1 - Bangkok\n2 - Dubai\n3 - São Paulo\n4- Nova York\n5 - Londres\n6 - Sydney\n7 - Moscou\n8 - Cidde do México\n9 - Tóquio\n10 - Cairo\n0 - Sair.\n-> ");
    }
    public static int temperature(int selecMenu) {
        int temperature = 0;
        switch (selecMenu) {
            case 1: temperature = 28; break;
            case 2: temperature = 27; break;
            case 3: temperature = 19; break;
            case 4: temperature = 12; break;
            case 5: temperature = 18; break;
            case 6: temperature = 11; break;
            case 7: temperature = 5; break;
            case 8: temperature = 16; break;
            case 9: temperature = 16; break;
            case 10: temperature = 22; break;
        }
        return temperature;
    }
public class Utilitario {
    public static void pausar(long segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("A pausa foi interrompida.");
        }
    }
}
}
