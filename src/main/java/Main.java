import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.Model.Weather;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj mnie nazwe miejscowosci:");
        String city = scanner.next();

        URL url = new URL ("http://api.apixu.com/v1/current.json?key=08eeefcc833a4ff2b84122246191003&q=" + city  + "\n");

        ObjectMapper mapper = new ObjectMapper();
        Weather weather = mapper.readValue(url, Weather.class);
        System.out.println("Temparatura w " + city + " wynosi: " + weather.getCurrent().getTemp_c() + " stopni C");

    }


}
