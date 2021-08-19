package controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import service.VehicleService;

@RestController	
@CrossOrigin
public class VehicleController {
	
	private VehicleService service;

	public VehicleController(VehicleService service) {
		super();
		this.service = service;
	}
	

	
}
