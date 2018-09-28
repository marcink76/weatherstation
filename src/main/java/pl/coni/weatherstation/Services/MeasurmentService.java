package pl.coni.weatherstation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coni.weatherstation.model.Measurement;
import pl.coni.weatherstation.repositories.MeasurmentRepo;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class MeasurmentService {

    @Autowired
    private MeasurmentRepo measurmentRepo;

    public Measurement saveMeasurment(Measurement measurement) {
        measurement.setTime(LocalTime.now());
        measurement.setDate(LocalDate.now());
        measurmentRepo.save(measurement);
        return measurement;
    }

    public double average() {
        return 9.9;
    }
}
