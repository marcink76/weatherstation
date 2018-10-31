package pl.coni.weatherstation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Entrance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entranceId;

    private LocalDate localDate;

    private LocalTime localTime;

    private String rfidCardNo;

    private boolean accesGranted;

    private String lockerIp;

    public boolean isAccesGranted() {
        return accesGranted;
    }

    public void setAccesGranted(boolean accesGranted) {
        this.accesGranted = accesGranted;
    }

    public Long getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Long entranceId) {
        this.entranceId = entranceId;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public String getRfidCardNo() {
        return rfidCardNo;
    }

    public void setRfidCardNo(String rfidCardNo) {
        this.rfidCardNo = rfidCardNo;
    }

    public String getLockerIp() {
        return lockerIp;
    }

    public void setLockerIp(String lockerIp) {
        this.lockerIp = lockerIp;
    }
}
