package it.formarete.persistence;

import java.util.List;

public interface ServiziDaoContratto<T>  {
	void save(T ogg);
	void update(T ogg);
	void delete(T ogg);
	T get(int id);
	List<T> getAll();
}
