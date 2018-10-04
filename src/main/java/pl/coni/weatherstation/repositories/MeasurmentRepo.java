package pl.coni.weatherstation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coni.weatherstation.model.Measurement;

@Repository
public interface MeasurmentRepo extends JpaRepository<Measurement, Long> {

    Measurement findFirstByOrderByIdDesc();

    @Query(value = "select avg(t.temperature) from Measurement t")
    double avarageTemperature();

    @Query(value = "select avg(h.humidity) from Measurement h")
    double avarageHumidity();

    @Query(value = "select avg(p.pressure) from Measurement p")
    double avaragePressure();

    @Query(value = "select max(p.temperature) from Measurement p")
    double maxTemperature();

    @Query(value = "select max(p.humidity) from Measurement p")
    double maxHumidity();

    @Query(value = "select max(p.pressure) from Measurement p")
    double maxPressure();

    @Query(value = "select min(p.temperature) from Measurement p")
    double minTemperature();

    @Query(value = "select min(p.humidity) from Measurement p")
    double minHumidity();

    @Query(value = "select min(p.pressure) from Measurement p")
    double minPressure();
}
