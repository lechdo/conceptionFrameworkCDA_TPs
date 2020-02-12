package fr.eni.jpa.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import fr.eni.jpa.service.GestionBouteille;

/**
 * Servlet implementation class AfficherServlet
 */
@WebServlet("/afficher")
public class AfficherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Autowired
	private GestionBouteille gb;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(gb.lister());
		request.setAttribute("bout", gb.lister());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/afficher.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
