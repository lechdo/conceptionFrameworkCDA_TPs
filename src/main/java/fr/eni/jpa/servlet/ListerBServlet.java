package fr.eni.jpa.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.eni.jpa.bo.Bouteille;
import fr.eni.jpa.service.GestionBouteille;
import fr.eni.jpa.service.GestionCouleur;

/**
 * Servlet implementation class ListerBServlet
 */
@WebServlet("/lister")
public class ListerBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	@Autowired
	private GestionBouteille gb;
	
	
	
	
    @Override
	public void init(ServletConfig config) throws ServletException {
    	SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public ListerBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
ServletContext context = getServletContext();
		

		List<Bouteille> liste = (List<Bouteille>) context.getAttribute("tri");
		
		if (liste != null) {
			request.setAttribute("listeB", request.getAttribute("tri"));
		} else {
			request.setAttribute("listeB", gb.lister());
		}
		
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listerB.jsp");
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
