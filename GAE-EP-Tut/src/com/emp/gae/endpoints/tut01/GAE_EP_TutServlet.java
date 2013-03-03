package com.emp.gae.endpoints.tut01;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GAE_EP_TutServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
