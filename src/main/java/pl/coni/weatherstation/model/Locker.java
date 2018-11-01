package pl.coni.weatherstation.model;

import javax.persistence.*;

@Entity
public class Locker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lockerId;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    private String lockerIp;
}