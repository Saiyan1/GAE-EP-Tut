package com.emp.gae.endpoints.tut01;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.gae.endpoints.tut01.model.Mensaje;
import com.googlecode.objectify.ObjectifyService;

public class ChatServlet extends HttpServlet{
		//TODO - Si hay menos de 12 mensajes en DS, corregir!
	private static final int cantMensajesPantalla = 12;
	
    static {
        ObjectifyService.register(Mensaje.class);
    }
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Mensaje> mensajes = ofy().cache(false).load().type(Mensaje.class)
				.limit(cantMensajesPantalla)
				.order("-fecha")
				.list();
		int cantMensajesDS = mensajes.size();
			//Ordenar la lista al revés, ordenando "chatSyle"		
		List<Mensaje> mensajesOrdenados = new ArrayList<Mensaje>();
		if (cantMensajesDS > 0) {
			int cantMostrar = ( cantMensajesDS >= cantMensajesPantalla )?cantMensajesPantalla:cantMensajesDS;
			for (int i = cantMostrar-1; i >= 0; i--) {
				mensajesOrdenados.add(mensajes.get(i));
			}
				//Set mensajes en Request
			req.setAttribute("mensajes", mensajesOrdenados);			
		}

		req.getRequestDispatcher("/chat.jsp").forward(req, resp);
	}

}
