package com.practicoJSP.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.plexus.logging.Logger;

import com.practicoJSP.clases.NoticiaJsp;
import com.practicoJsp.MDB.NoticiaQUEUE;

import javax.jms.Queue;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;

/**
 * Servlet implementation class servletJsp
 */
/*
@JMSDestinationDefinitions(
	    value = {
	        @JMSDestinationDefinition(
	            name = "java:/queue/NOTICIAQueue",
	            interfaceName = "javax.jms.Queue",
	            destinationName = "NoticiaQueue"
	        )
	    }
	)*/


@WebServlet("/mdb")
public class servletMDB extends HttpServlet {
	
 /*   private static final long serialVersionUID = -8314035702649252239L;

    private static final int MSG_COUNT = 5;


    @Inject
    private JMSContext context;

    @Resource(lookup = "java:/queue/NOTICIAQueue")
    private Queue queue;*/
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletMDB() {
        super();
		
        // TODO Auto-generated constructor stub
    }
    		
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	      /*  response.setContentType("text/html");
	        
	       String mensaje = request.getParameter("mensaje");
	       
	      // mensaje.split(regex)
	        PrintWriter out = response.getWriter();
	        out.write("<h1>Quickstart: Example demonstrates the use of <strong>JMS 2.0</strong> and <strong>EJB 3.2 Message-Driven Bean</strong> in JBoss EAP.</h1>");
	        try {
	            
	            final Destination destination = queue;

	            out.write("<p>Sending messages to <em>" + destination + "</em></p>");
	            out.write("<h2>The following messages will be sent to the destination:</h2>");
	            for (int i = 0; i < MSG_COUNT; i++) {
	                String text = "This is message " + (i + 1);
	                context.createProducer().send(destination, text);
	                out.write("Message (" + i + "): " + text + "</br>");
	            }
	            out.write("<p><i>Go to your JBoss EAP server console or server log to see the result of messages processing.</i></p>");
	        } finally {
	            if (out != null) {
	                out.close();
	            }
	        }*/
	    

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		
		
		
	}

}
