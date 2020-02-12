package fr.eni.jpa.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
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
import fr.eni.jpa.service.GestionRegion;

/**
 * Servlet implementation class AjouterBServlet
 */
@WebServlet("/ajouter")
public class AjouterBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	GestionBouteille gb;

	@Autowired
	GestionCouleur gc;
	
	@Autowired
	GestionRegion gr;

	@Override
	public void init(ServletConfig config) throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterBServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("listeCoul", gc.lister());
		request.setAttribute("listeRegion", gr.lister());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ajouterB.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Bouteille bouteille = new Bouteille(request.getParameter("nom"),
								  Boolean.parseBoolean(request.getParameter("petillant")),
								  request.getParameter("millesime"),
								  Integer.parseInt(request.getParameter("quantite")),
								  gc.recuperer(Integer.parseInt(request.getParameter("couleurId"))),
								  gr.recuperer(Integer.parseInt(request.getParameter("regionId")))
								  );
		
		gb.ajouter(bouteille);
		
		response.sendRedirect(request.getContextPath() + "/afficher");
		
		
	}

}
