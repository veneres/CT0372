package it.unive.ch2.e3;

/**
 * Simple example of stringReplace usage
 */
public class StringReplaceExample {
    public static void main(String[] args) {
        String cityName = "Mississippi";
        System.out.println(String.format("cityName: %s, length: %d", cityName, cityName.length()));

        String cityNameReplace1 = cityName.replaceAll("i", "ii");
        System.out.println(String.format("cityNameReplace1: %s, length: %d", cityNameReplace1, cityNameReplace1.length()));

        String cityNameReplace2 = cityNameReplace1.replaceAll("ss", "s");
        System.out.println(String.format("cityNameReplace2: %s, length: %d", cityNameReplace2, cityNameReplace2.length()));

    }

}