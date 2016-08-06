package it.formarete.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import it.formarete.model.Tessera;

public class ServiziDaoTessera 
implements ServiziDaoContratto<Tessera> {

	@Override
	public void save(Tessera ogg) {
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
	public void update(Tessera ogg) {
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
	public void delete(Tessera ogg) {
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
	public Tessera get(int id) {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		Tessera t=null;
		try{
			t=session.get(Tessera.class,id);
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return t;
	}

	public Tessera login(int numero,String pwd) {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		Tessera t=null;
		try{
			t=(Tessera) session
					.createQuery("from Tessera T Where T.numeroTessera=:numero and T.password=:pwd")
					.setParameter("numero", numero)
					.setParameter("pwd", pwd)
					.uniqueResult();
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return t;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Tessera> getAll() {
		Session session = ServiziDaoSessione.getInstance();
		Transaction tx= session.beginTransaction();
		List<Tessera> list=null;
		try{
			list=session.createCriteria(Tessera.class).list();
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback(); //annullamento 
		}
		return list;
	}

}
