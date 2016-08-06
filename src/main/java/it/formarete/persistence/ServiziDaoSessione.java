package it.formarete.persistence;

import org.hibernate.Session;

public class ServiziDaoSessione {
	private static Session instance;

	public static Session getInstance() {
		if(instance==null){
			instance=H8Utils.getSessionFactory().openSession();}
		return instance;
	} 
	
	public static void close(){
		if(instance!=null){
			instance.close();
			instance=null;
		}		
	}
	
}
