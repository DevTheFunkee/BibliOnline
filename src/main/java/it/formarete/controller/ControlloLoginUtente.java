package it.formarete.controller;

import it.formarete.model.Tessera;
import it.formarete.persistence.ServiziDaoSessione;
import it.formarete.persistence.ServiziDaoTessera;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.InputMismatchException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ControlloLoginUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Tessera t=null;
		String msg=null;
		String destinazione="areaRis.jsp";
		ServiziDaoSessione.getInstance();
		try{
			int num=Integer.parseInt(request.getParameter("numero"));
			String pwd=request.getParameter("pass");
			t=new ServiziDaoTessera().login(num,pwd);
			PrintWriter out=response.getWriter();
			out.print(t);
			if(t!=null){
				HttpSession session=request.getSession();
				session.setAttribute("auth", t);				
			}else{
				request.setAttribute("authError", "Utente o pwd non corretti!");
				destinazione="formAccessoUtente.jsp";
			}
		}
		catch(InputMismatchException e){	
			request.setAttribute("authError", "Utente o pwd non corretti!");
			destinazione="formAccessoUtente.jsp";
		}
		catch(Exception e){	
			msg=URLEncoder.encode(e.getLocalizedMessage(),"UTF-8");	
			request.setAttribute("msg", msg);
			destinazione="errore.jsp";
		}
		finally{
		ServiziDaoSessione.close();
			RequestDispatcher rd=request.getRequestDispatcher(destinazione);
			rd.forward(request, response);
		}
		
	}

}
