package it.formarete.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import it.formarete.persistence.H8Utils;

/**
 * Application Lifecycle Listener implementation class H8Listerner
 **/
public class H8Listerner implements ServletContextListener {

   
	public void contextDestroyed(ServletContextEvent sce)  { 
         H8Utils.getSessionFactory().close();
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
         H8Utils.getSessionFactory();
    }
	
}
