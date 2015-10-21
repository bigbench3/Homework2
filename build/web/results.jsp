<%-- 
    Document   : index
    Created on : Oct 18, 2015, 6:40:09 PM
    Author     : Ben Hay and Haris Cesko
--%>

<%@include file="/Includes/header.html" %>

<h1>Future Value Calculator</h1>


<table>
    <tbody>
        <tr>
            <td class="alignRight">Investment Amount:</td>
            <td class="alignLeft">${input.investmentAmount}</td>
        </tr>
        <tr>
            <td class="alignRight">Yearly Interest Rate:</td>
            <td class="alignLeft">${input.yearlyInterestRate}</td>
        </tr>
        <tr>
            <td class="alignRight">Number of Years:</td>
            <td class="alignLeft">${input.numberOfYears}</td>
        </tr>
        <tr>
            <td class="alignRight">Future </td>
            <td class="alignLeft"></td>
        </tr>
    </tbody>
</table>

<%@include file="/Includes/footer.html" %>
