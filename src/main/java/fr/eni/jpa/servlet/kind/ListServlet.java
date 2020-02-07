package fr.eni.jpa.servlet.kind;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.jpa.bean.Kind;
import fr.eni.jpa.dao.DAOFactory;
import fr.eni.jpa.dao.GenericDao;
import fr.eni.jpa.exceptions.DAOException;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/listerStyle")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		listeS
		DAOFactory fact = new DAOFactory();
		
		GenericDao<Kind, Integer> dao = fact.getKindDAO();
		
		Kind k1 = new Kind("film");
		Kind k2 = new Kind("Super film");
		
		try {
			dao.add(k1);
			dao.add(k2);
		} catch (DAOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listeStyles.jsp");
		try {
			request.setAttribute("listeS", dao.findAll());
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
