package pl.coni.weatherstation.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_czujnika")
    private Long sensor_id;

    @Column(name = "Nazwa_czujnika")
    private String sensorName;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @OneToMany
    @JoinColumn(name = "id_czujnika")
    private Set<Measurement> measurement;


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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Set<Measurement> getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Set<Measurement> measurement) {
        this.measurement = measurement;
    }
}

