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
}
