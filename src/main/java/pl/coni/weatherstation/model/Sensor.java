package pl.coni.weatherstation.model;

import javax.persistence.*;

@Entity
@Table(name = "Czujnik")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_czujnika")
    private Long sensor_id;

    @Column(name = "Nazwa_czujnika")
    private String sensorName;

    @Column(name = "Polozenie_czujnika")
    private String sensorPlace;

    public Sensor(String sensorName, String sensorPlace) {
        this.sensorName = sensorName;
        this.sensorPlace = sensorPlace;
    }

    public Long getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(Long sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorPlace() {
        return sensorPlace;
    }

    public void setSensorPlace(String sensorPlace) {
        this.sensorPlace = sensorPlace;
    }
}

