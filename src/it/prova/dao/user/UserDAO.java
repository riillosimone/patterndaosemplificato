package it.prova.dao.user;

import java.time.LocalDate;
import java.util.List;

import it.prova.dao.IBaseDAO;
import it.prova.model.User;

public interface UserDAO extends IBaseDAO<User> {
	
	public List<User> findAllWhereDateCreatedGreaterThan(LocalDate dateCreatedInput) throws Exception;
	public List<User> findAllByCognome(String cognomeInput) throws Exception;
	public List<User> findAllByLoginIniziaCon(String caratteriInizialiInput) throws Exception;
	public User findByLoginAndPassword(String loginInput, String passwordInput) throws Exception;
	public List<User> findAllByPasswordIsNull() throws Exception;

}
