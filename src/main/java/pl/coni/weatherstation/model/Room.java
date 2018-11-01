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
    @JoinColumn(name = "room_id")
    private Set<Switch> switchSet;

    @OneToMany
    @JoinColumn(name = "room_id")
    private Set<Sensor> sensorSet;

    @OneToMany
    @JoinColumn(name = "room_id")
    private Set<Locker> lockerSet;

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Set<Switch> getSwitchSet() {
        return switchSet;
    }

    public void setSwitchSet(Set<Switch> switchSet) {
        this.switchSet = switchSet;
    }

    public Set<Sensor> getSensorSet() {
        return sensorSet;
    }

    public void setSensorSet(Set<Sensor> sensorSet) {
        this.sensorSet = sensorSet;
    }

    public Set<Locker> getLockerSet() {
        return lockerSet;
    }

    public void setLockerSet(Set<Locker> lockerSet) {
        this.lockerSet = lockerSet;
    }
}
