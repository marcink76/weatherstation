package pl.coni.weatherstation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coni.weatherstation.model.Measurement;

@Repository
public interface MeasurmentRepo extends JpaRepository<Measurement, Long> {

    @Query(value = "select avg(t.temperature) from Measurement t")
    double avarageTemperature();

    @Query(value = "select avg(h.humidity) from Measurement h")
    double avarageHumidity();

    @Query(value = "select avg(p.pressure) from Measurement p")
    double avaragePressure();
}
