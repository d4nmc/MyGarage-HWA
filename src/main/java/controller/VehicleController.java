package controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping("/add")
	public ResponseEntity<String> createVehicle(@RequestBody Vehicle vehicle) {

		// this.service.createVehicle(vehicle);
		return new ResponseEntity<String>(
				"Vehicle name: " + vehicle.getBrand() + vehicle.getName() + " added to garage list",
				HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Vehicle>> getAllVehicles() {

		List<Vehicle> vehicleList = this.service.getAllVehicles();
		return ResponseEntity.ok(vehicleList);

	}

	@PatchMapping("/updateVehicle/{id}")
			public ResponseEntity<Vehicle> updateVehicle(@PathVariable Long id,
					@RequestBody Vehicle vehicle) {
				
				return new ResponseEntity<Vehicle> (this.service.updateVehicle(id, vehicle), 
						HttpStatus.ACCEPTED);
				
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteVehicle(@PathVariable Long id) {

		this.service.deleteVehicle(id);

		return new ResponseEntity<String>("Vehicle id: " + id + " has been deleted", HttpStatus.OK);

	}

}