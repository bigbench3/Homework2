/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.invetment;

import java.io.Serializable;

/**
 *
 * @author bhay
 */
public class Investment implements Serializable {
    
        private double investmentAmmount;
        private double interestRate;
        private int numberOfYears;
        private double futureValue = 0;
        
        public Investment(){
            investmentAmmount = 0;
            interestRate = 0;
            numberOfYears = 0;
        }
        
         public Investment(double investmentAmount, double interestRate, int numberOfYears){
            this.investmentAmmount = investmentAmount;
            this.interestRate = interestRate;
            this.numberOfYears = numberOfYears;
        }
        
        public double getInvestmentAmmount(){
            return investmentAmmount;
        }
        
        public void setInvestmentAmmount(double investmentAmmount){
            this.investmentAmmount = investmentAmmount;
        }
        
        public double getInterestRate(){
            return interestRate;
        }
        
        public void setInterestRate(double interestRate){
            this.interestRate = interestRate;
        }
        
        public int getnumberOfYears(){
            return numberOfYears;
        }
        
        public void setNumberOfYears(int numberOfYears){
            this.numberOfYears = numberOfYears;
        }
        
        public double getFutureValue(){
            return futureValue;
        }
        
        public void setFutureValue(double futureValue){
            this.futureValue = futureValue;
        }
}




