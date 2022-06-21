
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
       
  
       
        //loads the JSP
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //capture the number paramater
        String numbirthday  = request.getParameter("num_birthday");
        
        
        
        if( numbirthday == null  ) {
            // Error Message
            String message = "You must give your current age";
            // error attribute
           request.setAttribute("message", message);
            
           // show the user the same jsp 
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;  
}
        
        
         
        if (numbirthday != null) {
            
            int number = Integer.parseInt(numbirthday);
            number++;
            System.out.println(number);
            
            String numMessage = "Your age next birthday will be " + number;
            request.setAttribute("numMessage", numMessage);
            
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
    }
}
