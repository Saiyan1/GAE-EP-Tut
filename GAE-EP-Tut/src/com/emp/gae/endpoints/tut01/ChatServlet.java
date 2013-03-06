package com.emp.gae.endpoints.tut01;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.gae.endpoints.tut01.model.Mensaje;
import com.googlecode.objectify.ObjectifyService;

public class ChatServlet extends HttpServlet{

    static {
        ObjectifyService.register(Mensaje.class);
    }
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Mensaje> mensajes = ofy().load().type(Mensaje.class)
				.limit(10)
				.order("-fecha")
				.list();
		req.setAttribute("mensajes", mensajes);
		req.getRequestDispatcher("/chat.jsp").forward(req, resp);
	}

}
