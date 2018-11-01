package pl.coni.weatherstation.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Measurement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pomiaru")
    private Long id;

    @Column(name = "Data_Pomiaru")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @Column(name = "Czas_pomiaru")
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime time;

    @Column(name = "wilgotnosc")
    private double humidity;

    @Column(name = "Temperatura")
    private double temperature;

    @Column(name = "Ciśnienie")
    private double pressure;

    @Column(name = "PM0.1")
    private int pm01;

    @Column(name = "PM2.5")
    private int pm25;

    @Column(name = "PM10")
    private int pm10;

    @Column(name = "Deszcz")
    private boolean rain;

    @Column(name = "Intensywność_opadu")
    private int intensityOfRain;

    @Column(name = "Opis")
    private String description;

    @Column(name = "Punkt_rosy")
    private float dewPoint;

    @ManyToOne
    @JoinColumn(name = "id_czujnika")
    private Sensor sensor;


    public Measurement() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getPm01() {
        return pm01;
    }

    public void setPm01(int pm01) {
        this.pm01 = pm01;
    }

    public int getPm25() {
        return pm25;
    }

    public void setPm25(int pm25) {
        this.pm25 = pm25;
    }

    public int getPm10() {
        return pm10;
    }

    public void setPm10(int pm10) {
        this.pm10 = pm10;
    }

    public boolean isRain() {
        return rain;
    }

    public void setRain(boolean rain) {
        this.rain = rain;
    }

    public void setPm1(int pm01) {
        this.pm01 = pm01;
    }

    public int getIntensityOfRain() {
        return intensityOfRain;
    }

    public void setIntensityOfRain(int intensityOfRain) {
        this.intensityOfRain = intensityOfRain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public float getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(float dewPoint) {
        this.dewPoint = dewPoint;
    }
}
