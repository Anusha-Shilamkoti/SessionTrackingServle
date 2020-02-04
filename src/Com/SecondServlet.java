package Com;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.tomcat.util.http.parser.Cookie;


public class SecondServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub
		  try{  
			  
			    response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			      
			     Cookie ck[]=request.getCookies();  
			    out.print("Hello "+ck[0].getValue());  
			  
			    out.close();  
			  
			         }catch(Exception e){System.out.println(e);}  
			    }
	

}
