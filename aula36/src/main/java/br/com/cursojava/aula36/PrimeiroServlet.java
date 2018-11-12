package br.com.cursojava.aula36;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiroServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		StringBuilder html = new StringBuilder();
		html
		.append("<!doctype html>")
		.append("<html>")
		.append("<head><meta charset=\"utf - 8 \">")
		.append("<title> Primeiro Servlet </title>")
		.append("</head>")
		.append("<h1> Meu primeiro Servlet chamado Ronaldo </h1>")
		.append("</body>")
		.append("</html>");
		
		writer.println(html);
		
		}
}
