package pl.coni.weatherstation.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    private String roomName;

    @OneToMany
    private Set<Switch> switchSet;

    @OneToMany
    private Set<Sensor> sensorSet;
}
