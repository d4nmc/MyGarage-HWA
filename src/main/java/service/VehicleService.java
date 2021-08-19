package service;

import java.util.List;

import org.springframework.stereotype.Service;

import database.VehicleDatabase;
import model.Vehicle;

@Service
public class VehicleService {
	
	private VehicleDatabase database;
	
	public VehicleService(VehicleDatabase database) {
		super();
		this.database = database;
	}

	public Vehicle createVehicle(Vehicle vehicle ) {
		return this.database.save(vehicle);
	}
	
		
	public List<Vehicle> getAllVehicles() {
		
		return this.database.findAll();
		
	}

	public Vehicle updateVehicle(Long id, Vehicle vehicle) {
		
		
		return updateVehicle(null, null);
	}

	public void deleteVehicle(Long id) {
		
		this.database.deleteById(id);
	}

	

}

