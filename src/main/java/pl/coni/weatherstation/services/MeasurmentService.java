package pl.coni.weatherstation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coni.weatherstation.model.Measurement;
import pl.coni.weatherstation.repositories.MeasurmentRepo;
import pl.coni.weatherstation.utils.Utils;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class MeasurmentService {


    private MeasurmentRepo measurmentRepo;

    @Autowired
    public MeasurmentService(MeasurmentRepo measurmentRepo) {
        this.measurmentRepo = measurmentRepo;
    }

    public Measurement saveMeasurment(Measurement measurement) {
        measurement.setTime(LocalTime.now());
        measurement.setDate(LocalDate.now());
        measurement.setDewPoint((float) Utils.dewPoint(measurement.getTemperature(), measurement.getHumidity()));
        measurmentRepo.save(measurement);
        return measurement;
    }
}
