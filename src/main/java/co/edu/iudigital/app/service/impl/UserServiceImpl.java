package co.edu.iudigital.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.Users;
import co.edu.iudigital.app.model.repository.UserRepository;
import co.edu.iudigital.app.service.iface.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void create(Users users) {
		//TODO: implementar		
	}

	
	
	
	@Override
	public Users login(Users users) throws Exception{
		Users existsUsers = userRepository.findByEMAILAndPASSWORD(users.getEMAIL(), users.getPASSWORD());
		
		if (existsUsers== null) {
			throw new Exception ("Usuario y/o contraseña ivalidos");
			
		}
		return existsUsers;
	
		
	}

}
