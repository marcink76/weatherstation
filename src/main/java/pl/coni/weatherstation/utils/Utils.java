package pl.coni.weatherstation.utils;

public class Utils {

    public static double dewPoint(double temperature, double humidity) {
        return temperature - ((100 - humidity) / 5);
    }
}
