package Temperatura;

public class Temperatura {

    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }
}
