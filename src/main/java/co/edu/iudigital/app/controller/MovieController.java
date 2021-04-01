package co.edu.iudigital.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.app.model.entity.Movie;
import co.edu.iudigital.app.service.iface.MovieService;

@RestController
@RequestMapping("/movie")
@CrossOrigin("*")

public class MovieController {
	
	@Autowired
	private MovieService movieService;
	@GetMapping
	public List<Movie> getAll(){
		return movieService.getAll();
	}

}
