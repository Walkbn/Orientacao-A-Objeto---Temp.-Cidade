public class TemperatureCity {
    public static int generalTemperature (int selecMenu) {
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
}