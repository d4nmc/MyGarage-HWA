package database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Vehicle;

@Repository
public interface VehicleDatabase extends JpaRepository<Vehicle, Long>{
	
	
}
