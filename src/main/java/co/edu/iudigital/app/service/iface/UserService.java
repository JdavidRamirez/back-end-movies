package co.edu.iudigital.app.service.iface;

import co.edu.iudigital.app.model.entity.Users;

public interface UserService {
	/**
	 * Create a new user
	 * @param users
	 */
	public void create(Users users);
	
	/**
	 * Log an users
	 * @param users
	 * @return
	 * @throws Exception
	 */
	
	public Users login(Users users) throws Exception;

}
