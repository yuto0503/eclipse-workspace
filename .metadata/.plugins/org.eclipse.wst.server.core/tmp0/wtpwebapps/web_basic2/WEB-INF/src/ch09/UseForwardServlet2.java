package ch09;

import java.io.IOException;

import org.eclipse.jdt.internal.compiler.ast.ThrowStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseForwardServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		throws ServletException, IOException {
			RequestDispatcher dispatcher = RequestDispatcher.getRequestDispatcher("/UseForwardServlet1");
			dispatcher.forward(req, resp);
		}
	}
}