package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Vehicle;
import repo.VehicleRepo;

@Service
public class VehicleService {
	
	private VehicleRepo repo;
	
	public VehicleService(VehicleRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Vehicle> getAllVehicles() {
		// TODO Auto-generated method stub
		return null;
	}

	public Vehicle updateVehicle(Long id, Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteVehicle(Long id) {
		// TODO Auto-generated method stub
		
	}

}

