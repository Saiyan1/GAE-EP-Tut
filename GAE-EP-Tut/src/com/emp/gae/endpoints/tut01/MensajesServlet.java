package com.emp.gae.endpoints.tut01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.googlecode.objectify.ObjectifyService.ofy;
import com.emp.gae.endpoints.tut01.model.Mensaje;
import com.googlecode.objectify.ObjectifyService;

public class MensajesServlet extends HttpServlet {

    static {
        ObjectifyService.register(Mensaje.class);
    }
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("GET");
		
		resp.sendRedirect("/mensajes.jsp");
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("POST");
		
		String nick = (String) req.getParameter("nick");
		String msg = (String) req.getParameter("msg");
		Mensaje mensaje = new Mensaje(nick, msg);
		ofy().save().entity(mensaje);
		
		resp.sendRedirect("/mensajes.jsp");
	}


}
