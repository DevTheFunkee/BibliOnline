package it.formarete.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import it.formarete.model.Autore;


public class ServiziDaoAutore implements ServiziDaoContratto<Autore> {

	@Override
	public void save(Autore ogg) {
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
	public void update(Autore ogg) {
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
	public void delete(Autore ogg) {
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
	public Autore get(int id) {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		Autore a=null;
		try{
			a=session.get(Autore.class,id);
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return a;
	}

	@SuppressWarnings("unchecked")
	public List<Autore> getByCognome(String cognome) {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		List<Autore> lista=new ArrayList<Autore>();
		try{
			lista=session.createQuery("from Autore A Where A.cognome Like :cognome")
					.setParameter("cognome", cognome)
					.list();
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return lista;
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Autore> getAll() {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		List<Autore> list=new ArrayList<Autore>();
		try{
			list=session.createCriteria(Autore.class).list();
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return list;
	}

}
