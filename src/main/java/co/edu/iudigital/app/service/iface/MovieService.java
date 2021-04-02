package co.edu.iudigital.app.service.iface;

import java.util.List;

import co.edu.iudigital.app.model.entity.Movie;

public interface MovieService {
	/**
	 * Get all films
	 * @return
	 */
	public List<Movie> getAll();
	/**
	 * Create a film
	 * @param
	 */
	public void create(Movie movie);
	/**
	 * Edit a movie by his Id
	 * @param movie
	 * @param movieId
	 */
	public void edit(Movie movie, int movieId);
	/**
	 * Erase a movie by his Id
	 * @param movieId
	 */
	public void delete(int movieId);
	/**
	 * Califica una película
	 * @param movie
	 * @param movieId
	 */
	public void rate(Movie movie, int movieId);

}
