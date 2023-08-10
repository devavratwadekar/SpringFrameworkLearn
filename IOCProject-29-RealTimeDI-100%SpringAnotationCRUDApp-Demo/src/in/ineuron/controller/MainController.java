package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.service.IEmployeeService;

@Component(value = "controller")
public class MainController {

	static {
		System.out.println("MainController.class file is loading...");
	}

	public MainController() {
		System.out.println("MainController :: Zero param constructor...");
	}

	@Autowired
	IEmployeeService service;

	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}

}
