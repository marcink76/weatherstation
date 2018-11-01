package pl.coni.weatherstation.model;

import javax.persistence.*;

@Entity
public class Switch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long switchId;

    @Column(name = "nazwa_przełącznika")
    private String switchName;

    @Column(name = "ip_przełącznika")
    private String switchIp;

    @Column(name = "pin_przełącznika")
    private short switchPinOut;

    @JoinColumn(name = "room_id")
    @ManyToOne
    private Room room;

    public Long getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Long switchId) {
        this.switchId = switchId;
    }

    public String getSwitchName() {
        return switchName;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public String getSwitchIp() {
        return switchIp;
    }

    public void setSwitchIp(String switchIp) {
        this.switchIp = switchIp;
    }

    public short getSwitchPinOut() {
        return switchPinOut;
    }

    public void setSwitchPinOut(short switchPinOut) {
        this.switchPinOut = switchPinOut;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
