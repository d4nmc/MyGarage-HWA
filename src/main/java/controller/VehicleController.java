package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Vehicle;
import service.VehicleService;

@RestController
@CrossOrigin
public class VehicleController {

	private VehicleService service;

	public VehicleController(VehicleService service) {
		super();
		this.service = service;
	}

	@GetMapping("/hello")
	public String helloTest() {
		return "Hello Test";
	}
	
	public ResponseEntity<String> createVehicle(@RequestBody Vehicle vehicle) {
		
		this.service.createVehicle(vehicle);
		return new ResponseEntity<String>("Vehicle name: " + vehicle.getBrand() + vehicle.getName() + " added to list", HttpStatus.CREATED);
	}

	
	
}