package ch09;

import java.io.IOException;

import org.apache.catalina.filters.RemoteIpFilter.XForwardedRequest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseForwardServlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		throw ServletException, IOException {
			System.out.println("サーブレットの実行");
			
			RequestDispatcher dispatcher = RequestDispatcher.getRequestDispatcher("/view/ch09/useForward.jsp");
			dispatcher.forward(req, resp);
			System.out.println("サーブレットの終了");
			  

		}
	}
}