package it.formarete.controller;

import it.formarete.model.Autore;
import it.formarete.model.Editore;
import it.formarete.model.Genere;
import it.formarete.model.Lingua;
import it.formarete.persistence.ServiziDaoAutore;
import it.formarete.persistence.ServiziDaoEditore;
import it.formarete.persistence.ServiziDaoGenere;
import it.formarete.persistence.ServiziDaoLingua;
import it.formarete.persistence.ServiziDaoSessione;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ControlloFormLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiziDaoSessione.getInstance();
		List<Autore> autori = new ServiziDaoAutore().getAll();
		List<Genere> generi = new ServiziDaoGenere().getAll();
		List<Editore> editori = new ServiziDaoEditore().getAll();
		List<Lingua> lingue = new ServiziDaoLingua().getAll();
		request.setAttribute("autori", autori);
		request.setAttribute("generi", generi);
		request.setAttribute("editori", editori);
		request.setAttribute("lingue", lingue);
		ServiziDaoSessione.close();
		RequestDispatcher rd= request.getRequestDispatcher("riservatoFormLibro.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
