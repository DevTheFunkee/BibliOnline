package it.formarete.controller;

import it.formarete.model.Libro;
import it.formarete.persistence.ServiziDaoLibro;
import it.formarete.persistence.ServiziDaoSessione;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControlloElencoLibri
 */
public class ControlloElencoLibri extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiziDaoSessione.getInstance();
		List<Libro> libri=new ServiziDaoLibro().getAll();
		ServiziDaoSessione.close();
		request.setAttribute("libri", libri);
		RequestDispatcher rd=request.getRequestDispatcher("elencoLibri.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
