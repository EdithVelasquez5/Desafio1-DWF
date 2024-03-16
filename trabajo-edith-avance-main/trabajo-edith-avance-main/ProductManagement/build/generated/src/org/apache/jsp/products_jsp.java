package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Product Management</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\n");
      out.write("            integrity=\"sha384-KyZXEAg3QhqLMpG8r+K/pR6n7P8w8f0E9Ub5xnqY4I/y4mxvkdj7duyQskQsNxh4\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@10\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h1 class=\"mt-3\">Product Management</h1>\n");
      out.write("\n");
      out.write("    <form method=\"post\" action=\"ProductServlet\" class=\"mt-3\">\n");
      out.write("        <input type=\"hidden\" name=\"action\" value=\"add\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"name\">Name:</label>\n");
      out.write("            <input type=\"text\" name=\"name\" id=\"name\" class=\"form-control\" required>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"id\">ID:</label>\n");
      out.write("            <input type=\"text\" name=\"id\" id=\"id\" class=\"form-control\" required>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"price\">Price:</label>\n");
      out.write("            <input type=\"text\" name=\"price\" id=\"price\" class=\"form-control\" required>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"quantity\">Quantity:</label>\n");
      out.write("            <input type=\"text\" name=\"quantity\" id=\"quantity\" class=\"form-control\" required>\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Add Product</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <table class=\"table mt-5\">\n");
      out.write("        <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>Price</th>\n");
      out.write("            <th>Quantity</th>\n");
      out.write("            <th>Actions</th>\n");
      out.write("        </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("        <c:forEach var=\"product\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" varStatus=\"loop\">\n");
      out.write("            <tr>\n");
      out.write("                <form method=\"post\" action=\"products\">\n");
      out.write("                    <input type=\"hidden\" name=\"action\" value=\"edit\">\n");
      out.write("                    <input type=\"hidden\" name=\"index\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <td><input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required></td>\n");
      out.write("                    <td><input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required></td>\n");
      out.write("                    <td><input type=\"text\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required></td>\n");
      out.write("                    <td><input type=\"text\" name=\"quantity\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required></td>\n");
      out.write("                    <td>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Edit</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger\" onclick=\"deleteProduct(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\">Delete</button>\n");
      out.write("                    </td>\n");
      out.write("                </form>\n");
      out.write("            </tr>\n");
      out.write("        </c:forEach>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function deleteProduct(index) {\n");
      out.write("        Swal.fire({\n");
      out.write("            title: 'Delete Product',\n");
      out.write("            text: 'Are you sure you want to delete this product?',\n");
      out.write("            icon: 'warning',\n");
      out.write("            showCancelButton: true,\n");
      out.write("            confirmButtonColor: '#3085d6',\n");
      out.write("            cancelButtonColor: '#d33',\n");
      out.write("            confirmButtonText: 'Yes, delete it!'\n");
      out.write("        }).then((result) => {\n");
      out.write("            if (result.isConfirmed) {\n");
      out.write("                var form = document.createElement(\"form\");\n");
      out.write("                form.method = \"post\";\n");
      out.write("                form.action = \"products\";\n");
      out.write("\n");
      out.write("                var actionInput = document.createElement(\"input\");\n");
      out.write("                actionInput.type = \"hidden\";\n");
      out.write("                actionInput.name = \"action\";\n");
      out.write("                actionInput.value = \"delete\";\n");
      out.write("                form.appendChild(actionInput);\n");
      out.write("\n");
      out.write("                var indexInput = document.createElement(\"input\");\n");
      out.write("               type = \"hidden\";\n");
      out.write("                indexInput.name = \"index\";\n");
      out.write("                indexInput.value = index;\n");
      out.write("                form.appendChild(indexInput);\n");
      out.write("\n");
      out.write("                document.body.appendChild(form);\n");
      out.write("                form.submit();\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
