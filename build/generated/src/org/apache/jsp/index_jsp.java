package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Includes/header.html");
    _jspx_dependants.add("/Includes/footer.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("(c) Ben Hay and Haris Cesko \r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>CSC330 Homework 2</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>");
      out.write("\n");
      out.write("\n");
      out.write("<form>\n");
      out.write("    <h1>Future Value Calculator</h1>\n");
      out.write("    \n");
      out.write("    <label>Investment Amount</label>\n");
      out.write("    <input type=\"text\" name=\"investmentAmount\"><br>\n");
      out.write("    <label>Yearly Interest Rate</label>\n");
      out.write("    <input type=\"text\" name=\"yearlyIntrestRate\"><br> \n");
      out.write("    <label>Number of Years</label>\n");
      out.write("    <input type=\"text\" name=\"numberOfYears\"><br>\n");
      out.write("    <input type=\"submit\" value=\"Calculate\" id=\"calc\">\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"doCalc\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<!--\r\n");
      out.write("(c) Ben Hay and Haris Cesko \r\n");
      out.write("-->      \r\n");
      out.write("        <footer>\r\n");
      out.write("            <p>&copy; 2015, Ben Hay and Haris Cesko</p>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
