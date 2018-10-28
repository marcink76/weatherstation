package pl.coni.weatherstation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coni.weatherstation.model.Entrance;
import pl.coni.weatherstation.repositories.EntranceRepo;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class EntraceService {

    @Autowired
    private EntranceRepo entranceRepo;

    public Entrance saveEntrance(Entrance entrance) {
        entrance.setLocalDate(LocalDate.now());
        entrance.setLocalTime(LocalTime.now());
        entranceRepo.save(entrance);
        return entrance;
    }
}
