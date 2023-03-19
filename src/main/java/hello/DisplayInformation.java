package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.joda.time.DateTime;
import org.joda.time.LocalTime;

public class DisplayInformation {
    private String dayOfWeek;
    private String weather;
    private LocalTime localTime;
    private int temperature;

    public DisplayInformation() {
    }

    private DisplayInformation(String dayOfWeek, String weather, LocalTime localTime, int temperature) {
        this.dayOfWeek = dayOfWeek;
        this.weather = weather;
        this.localTime = localTime;
        this.temperature = temperature;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getWeather() {
        return weather;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void readLine() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        dayOfWeek = bufferedReader.readLine();
        weather = bufferedReader.readLine();
        localTime = new LocalTime();
        temperature = Integer.parseInt(bufferedReader.readLine());
        DisplayInformation displayInformation = new DisplayInformation(dayOfWeek,weather,localTime,temperature);
        System.out.println(displayInformation.getDayOfWeek());
        System.out.println(displayInformation.getWeather());
        System.out.println(displayInformation.getLocalTime());
        System.out.println(displayInformation.getTemperature()+" stopni");

    }
}
