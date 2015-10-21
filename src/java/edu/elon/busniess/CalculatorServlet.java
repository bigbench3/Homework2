/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.busniess;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.elon.invetment.Investment;

/**
 *
 * @author bhay
 */
@WebServlet(name = "CalculatorServlet", urlPatterns = {"/calc"})
public class CalculatorServlet extends HttpServlet {
    
 @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/index.jsp";
        
         String investmentAmount = request.getParameter("investmentAmount");
            String interestRate = request.getParameter("yearlyInterestRate");
            String numberOfYears = request.getParameter("numberOfYears");
            
            Investment investment = new Investment();
            investment.setInvestmentAmmount(Double.parseDouble(investmentAmount));
            investment.setInterestRate(Double.parseDouble(interestRate));
            investment.setNumberOfYears(Integer.parseInt(numberOfYears));
            
            double future = investment.getInvestmentAmmount()*(investment.getInterestRate()*investment.getnumberOfYears());
            
            request.setAttribute("investment", investment);
            
        
        String action = request.getParameter("action");
        
        if(action.equals("doCalc")){
            url = "/results.jsp";
        } else {
           url = "/index.jsp"; 
        }
        
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
    }
    
        @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
}
