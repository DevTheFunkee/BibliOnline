package it.formarete.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class ControlloProteggiAccesso
 */
public class ControlloProteggiAccesso implements Filter {


	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req=(HttpServletRequest) request;
		HttpSession session=req.getSession(true);
		if(session.getAttribute("auth")==null){
			//non autenticato
			//faccio un forwarding
			RequestDispatcher instrado=
					req.getRequestDispatcher("formAccessoUtente.jsp");
			instrado.forward(req, response);
		}
		else{
			//sono autenticato: posso passare
			chain.doFilter(req, response);
		}

		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
