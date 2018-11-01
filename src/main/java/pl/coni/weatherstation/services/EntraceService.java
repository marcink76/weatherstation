package pl.coni.weatherstation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coni.weatherstation.model.Entrance;
import pl.coni.weatherstation.model.RfidCard;
import pl.coni.weatherstation.repositories.EntranceRepo;
import pl.coni.weatherstation.utils.HTTPRequestSender;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class EntraceService {

    @Autowired
    private EntranceRepo entranceRepo;

    @Autowired
    private RfidCardService rfidCardService;

    @Autowired
    private HTTPRequestSender requestSender;

    private Entrance saveEntrance(Entrance entrance) {
        entrance.setLocalDate(LocalDate.now());
        entrance.setLocalTime(LocalTime.now());
        entranceRepo.save(entrance);
        return entrance;
    }

    public void checkCardNumber(Entrance entrance) throws IOException, InterruptedException {
        var cards = rfidCardService.getAllRfidCards();
        String param = "";
        for (RfidCard card : cards) {
            if (entrance.getRfidCardNo().equals(card.getRfidCardNumber())) {
                entrance.setAccesGranted(true);
                param = "unLock";
                break;
            } else {
                entrance.setAccesGranted(false);
                param = "lock";
            }
        }
        saveEntrance(entrance);
        requestSender.httpSender(entrance.getLockerIp(), param);
    }
}
