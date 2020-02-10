package fr.eni.spring.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.eni.spring.bean.Media;
import fr.eni.spring.bean.Mediatheque;

/**
 * Servlet implementation class MediaServlet
 */
@WebServlet("/media")
public class MediaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private Mediatheque mediathequeBean;
	
	
       
    @Override
	public void init(ServletConfig config) throws ServletException {
    	SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public MediaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/affiche.jsp");
		request.setAttribute("mediatheque", mediathequeBean);
		
		rd.forward(request, response);
//		response.sendRedirect(request.getContextPath() + "/afficher");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public Mediatheque getMediathequeBean() {
		return mediathequeBean;
	}

	public void setMediathequeBean(Mediatheque mediathequeBean) {
		this.mediathequeBean = mediathequeBean;
	}

}
