/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
       
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // getting parameters
        String firstNumber = request.getParameter("first_num");
        String secondNumber = request.getParameter("second_num");
        String operations = request.getParameter("operator");
        
        // setting attributes
        request.setAttribute("firstnumber", firstNumber);
        request.setAttribute("secondnumber", secondNumber);
        
        
        // parsing each number
        int fnumber = Integer.parseInt(firstNumber);
        int snumber = Integer.parseInt(secondNumber);
        
        String result = "--";
        request.setAttribute("result1",result);
        
        if (operations == null) {
          
            
        } else if (operations.equals("+")){
                    int addition = fnumber+snumber;
                    String addition1 = Integer.toString(addition);
                    result = addition1;
            request.setAttribute("result1",result);
        } else if ( operations.equals("-")){
                    int subtraction = fnumber - snumber;
                    
                    String subtraction1 = Integer.toString(subtraction);
                    result = subtraction1;
                    request.setAttribute("result1",result);
                    
        }else if ( operations.equals("*")){
                    int multiple = fnumber * snumber;
                    
                    String multiple1 = Integer.toString(multiple);
                    result = multiple1;
                    request.setAttribute("result1",result);
                    
        }else if ( operations.equals("%")){
                    int division = fnumber / snumber;
                    
                    String division1 = Integer.toString(division);
                    result = division1;
                    request.setAttribute("result1",result);
        }
        
      getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
        }
            
         
    
       
        }
        
    





