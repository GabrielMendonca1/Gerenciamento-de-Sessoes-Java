package web;



import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.*;


public class InfoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Get form data and save in session
        session.setAttribute("login", request.getParameter("login"));
        session.setAttribute("personal", request.getParameter("personal"));
        session.setAttribute("academic", request.getParameter("academic"));
        session.setAttribute("professional", request.getParameter("professional"));

        // Count the access and save in session
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            count = 1;
        } else {
            count++;
        }
        session.setAttribute("count", count);

        // Check the count and redirect if count >= 3
        if (count >= 3) {
            response.sendRedirect("Excedidos");
        } else {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Informacoes armazenadas com sucesso!</h1>");
            out.println("</body></html>");
        }
    }
}

