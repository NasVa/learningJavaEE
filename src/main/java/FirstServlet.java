import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Integer count = (Integer)session.getAttribute("count");
        if (count == null){
            session.setAttribute("count", 1);
            count = 1;
        }
        else{
            session.setAttribute("count", count + 1);
        }

        PrintWriter writer =response.getWriter();
        //String username = request.getParameter("name");
        writer.println("<html>");
        writer.println("<h3>salamm, your count: " + count + " times.</h3>");
        writer.println("</html>");

       // response.sendRedirect("/greeting.jsp?myname=Nastya");
        //RequestDispatcher dispatcher = request.getRequestDispatcher("/greeting.jsp?myname=Nastya");
        //dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
