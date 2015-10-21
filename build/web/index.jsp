<%-- 
    Document   : index
    Created on : Oct 18, 2015, 6:40:09 PM
    Author     : Ben Hay and Haris Cesko
--%>

<%@include file="/Includes/header.html" %>

<form method="post" action="calc">
    <h1>Future Value Calculator</h1>
    
    <label>Investment Amount</label>
    <input type="text" name="investmentAmount" required><br>
    <label>Yearly Interest Rate</label>
    <input type="text" name="yearlyInterestRate" required><br> 
    <label>Number of Years</label>
    <input type="text" name="numberOfYears" required placeholder="Integer number of years"><br>
    <input type="submit" value="Calculate" id="calc">
    <input type="hidden" name="action" value="doCalc">
</form>

<%@include file="/Includes/footer.html" %>
