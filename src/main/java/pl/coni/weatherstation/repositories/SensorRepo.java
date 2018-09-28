package pl.coni.weatherstation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coni.weatherstation.model.Sensor;

@Repository
public interface SensorRepo extends JpaRepository<Sensor, Long> {
}
