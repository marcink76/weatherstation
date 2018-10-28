package pl.coni.weatherstation.model;

import javax.persistence.*;

@Entity
public class RfidCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rfidId;

    private String rfidCardNumber;

    @ManyToOne
    private User user;

    public Long getRfidId() {
        return rfidId;
    }

    public void setRfidId(Long rfidId) {
        this.rfidId = rfidId;
    }

    public String getRfidCardNumber() {
        return rfidCardNumber;
    }

    public void setRfidCardNumber(String rfidCardNumber) {
        this.rfidCardNumber = rfidCardNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
