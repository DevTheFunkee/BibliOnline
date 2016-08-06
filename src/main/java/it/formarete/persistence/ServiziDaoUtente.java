package it.formarete.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import it.formarete.model.Utente;

public class ServiziDaoUtente 
implements ServiziDaoContratto<Utente>{

	@Override
	public void save(Utente ogg) {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		try{
			session.persist(ogg);
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}		
		
	}

	@Override
	public void update(Utente ogg) {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		try{
			session.update(ogg);
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}		
		
	}

	@Override
	public void delete(Utente ogg) {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		try{
			session.delete(ogg);
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}		
		
	}

	@Override
	public Utente get(int id) {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		Utente u=null;
		try{
			u=session.get(Utente.class,id);
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return u;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Utente> getAll() {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		List<Utente> list=new ArrayList<Utente>();
		try{
			list=session.createCriteria(Utente.class).list();
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return list;
	}

}
