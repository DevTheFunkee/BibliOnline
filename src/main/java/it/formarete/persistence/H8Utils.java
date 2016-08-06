package it.formarete.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class H8Utils {
	private static SessionFactory singleton;
	public static SessionFactory getSessionFactory() {
		if (singleton == null) {
			StandardServiceRegistry registry=null;
			try {
				registry = new StandardServiceRegistryBuilder()
						.configure() // configura h8 con i dati presi da hibernate.cfg.xml
						.build();
				singleton = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			}
			catch (Exception e){
				// Il registro sarà distrutto dalla SessionFactory, ma se SessionFactory ha problemi
				// lo facciamo noi qui
				StandardServiceRegistryBuilder.destroy(registry);
				System.err.println("La creazione della SessionFactory iniziale è fallita: " + e);
				throw new ExceptionInInitializerError(e);
			}
		}
		return singleton;
	}
}
