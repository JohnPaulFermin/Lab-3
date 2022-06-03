
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userage = request.getParameter("user_age");
    try {
        
       
  //      System.out.println(userage);
      
        int UserAge;
        UserAge = Integer.parseInt(userage);
        
        int nextage = UserAge + 1;
        String message = "Your age next birthday is "+ nextage;
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    } catch (Exception e) {
        if( userage == null || userage.equals("") ){
            // if validation fails:
            // Set up an error message
            String message = "You must give your current age";
            // put the error message into the request object as an attribute
            request.setAttribute("message", message);
            

    }
        else { String message = "You must enter a number";
         request.setAttribute("message", message);
    }
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);         
        
    }
    }
}
    




