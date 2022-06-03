
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {



 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message","---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstnum = request.getParameter("first_num");
        String secnum = request.getParameter("sec_num");
        
        
        
                request.setAttribute("firstNum", firstnum);
                request.setAttribute("secNum", secnum);
try{


        
        
        int Firstnum;
        int Secondnum;
        
        Firstnum = Integer.parseInt(firstnum);
        Secondnum = Integer.parseInt(secnum);
        if (request.getParameter("plus") !=null){
            request.setAttribute("message",Firstnum+Secondnum);
            

 
 
        }
        else if (request.getParameter("minus") !=null){
            request.setAttribute("message",Firstnum-Secondnum);
        }
        else if (request.getParameter("mult") !=null){
            request.setAttribute("message",Firstnum*Secondnum);
            
        }
        
        else if (request.getParameter("div") !=null){
        request.setAttribute("message",(double)Firstnum/Secondnum);
                }
    } catch (NumberFormatException e) {
                request.setAttribute("message","invalid input");
    }
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
        }
        
    
    

 




 


