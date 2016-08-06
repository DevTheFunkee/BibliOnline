package it.formarete.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import it.formarete.model.Editore;

public class ServiziDaoEditore 
implements ServiziDaoContratto<Editore> {

	@Override
	public void save(Editore ogg) {
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
	public void update(Editore ogg) {
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
	public void delete(Editore ogg) {
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
	public Editore get(int id) {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		Editore ed=null;
		try{
			ed=session.get(Editore.class,id);
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return ed;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Editore> getAll() {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		List<Editore> list=new ArrayList<Editore>();
		try{
			list=session.createCriteria(Editore.class).list();
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return list;
	}

}
