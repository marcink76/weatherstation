package pl.coni.weatherstation.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String firstName;

    private String lastName;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<RfidCard> rfidCard;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<RfidCard> getRfidCard() {
        return rfidCard;
    }

    public void setRfidCard(Set<RfidCard> rfidCard) {
        this.rfidCard = rfidCard;
    }
}
