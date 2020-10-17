import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet")

public class Servlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
        HttpSession session = req.getSession(true);
        
        res.setContentType("text/html");
        java.io.PrintWriter out = res.getWriter();
   
        Date creationTime = new Date(session.getCreationTime() );
        Date lastAccessed = new Date(session.getLastAccessedTime());
        DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        
        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Session Creation and Last-Accessed Time</h2>");
        out.println("Session creation time: " + formatter.format(creationTime) + "<br><br>");
        out.println("Last time the session was accessed: " + formatter.format(lastAccessed) );
        out.println("</body>");
        out.println("</html>");
	}
		
}
