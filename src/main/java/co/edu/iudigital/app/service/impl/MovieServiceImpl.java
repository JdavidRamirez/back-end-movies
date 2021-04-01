package co.edu.iudigital.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.Movie;
import co.edu.iudigital.app.model.repository.MovieRepository;
import co.edu.iudigital.app.service.iface.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public List<Movie> getAll(){
		List<Movie> movies= new ArrayList<>();
		movies =(List<Movie>) movieRepository.findAll();
		return movies;
	}
	

}
