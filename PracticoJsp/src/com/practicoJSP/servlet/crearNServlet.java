package com.practicoJSP.servlet;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.logging.Logger;
import com.practicoJSP.clases.NoticiaJsp;
import ControlJSP.ControlJsp;


/**
 * Servlet implementation class crearNServlet
 */
@WebServlet("/crearNServlet")
public class crearNServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public static final Logger logger = Logger.getLogger(crearNServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public crearNServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Inject
	ControlJsp cont;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {
			NoticiaJsp n = new NoticiaJsp();

			cont.init();

			n.setId(request.getParameter("id"));

			n.setDescripcion(request.getParameter("descripcion"));

			n.setTitulo(request.getParameter("titulo"));

			cont.crearNoticia(n);

			// request.getRequestDispatcher("paginas/mostrarNoticias.jsp").forward(request,
			// response);

		} catch (Exception e) {
			// TODO: handle exception
			logger.info(e);
		} finally {

			RequestDispatcher resultView = request.getRequestDispatcher("/mostrarNoticias.jsp");
			resultView.forward(request, response);
		}

	}

}
