package com.ltp.painting.controllers;

//import java.util.Arrays;
//import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.ltp.painting.model.Vista;



@org.springframework.stereotype.Controller //enviar los datos a una vista - object model 
@RequestMapping("/api/")
public class Controller {
	
	@GetMapping("/task4") //mapeo de la ruta con el servicio 
	public String index(Model model) {
//		model.addAttribute("titulo", "este es un atributo desde el controller");
		return "index"; //index hace refencia a la vista
		
	}
	
	@GetMapping("/task5") //mapeo de la ruta con el servicio 
	public String task5(Model model) {

	
		return "task5"; //index hace refencia a la vista
		
	}
	
	@GetMapping("/task7") //mapeo de la ruta con el servicio 
	public String task7(Model model) {
	 
	
		return "task7"; //index hace refencia a la vista
		
	}
	@GetMapping("/task8") //mapeo de la ruta con el servicio 
	public String task8(Model model) {
	 
	
		return "task8"; //index hace refencia a la vista
		
	}
}
