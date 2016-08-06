package it.formarete.persistence;

import it.formarete.model.Genere;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ServiziDaoGenere implements ServiziDaoContratto<Genere> {

	@Override
	public void save(Genere ogg) {
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
	public void update(Genere ogg) {
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
	public void delete(Genere ogg) {
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
	public Genere get(int id) {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		Genere g=null;
		try{
			g=session.get(Genere.class,id);
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return g;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Genere> getAll() {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		List<Genere> list=new ArrayList<Genere>();
		try{
			list=session.createCriteria(Genere.class).list();
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return list;
	}

}
