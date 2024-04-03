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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <style>\r\n");
      out.write("        \r\n");
      out.write("        *{\r\n");
      out.write("            font-family: monospace;\r\n");
      out.write("            font-size: large;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Administrador de productos</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\r\n");
      out.write("            integrity=\"sha384-KyZXEAg3QhqLMpG8r+K/pR6n7P8w8f0E9Ub5xnqY4I/y4mxvkdj7duyQskQsNxh4\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@10\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h1 class=\"mt-3\">Administrador de Productos</h1>\r\n");
      out.write("\r\n");
      out.write("    <form method=\"post\" action=\"ProductServlet\" class=\"mt-3\">\r\n");
      out.write("        <input type=\"hidden\" name=\"action\" value=\"add\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"name\">Nombre:</label>\r\n");
      out.write("            <input type=\"text\" name=\"name\" id=\"name\" class=\"form-control\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"id\">Identificacion:</label>\r\n");
      out.write("            <input type=\"text\" name=\"id\" id=\"id\" class=\"form-control\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"price\">Precio:</label>\r\n");
      out.write("            <input type=\"text\" name=\"price\" id=\"price\" class=\"form-control\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"quantity\">Cantidad:</label>\r\n");
      out.write("            <input type=\"text\" name=\"quantity\" id=\"quantity\" class=\"form-control\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <center>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Agregar Producto</button>\r\n");
      out.write("        </center>\r\n");
      out.write("        \r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <table class=\"table mt-5\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>Nombre</th>\r\n");
      out.write("            <th>ID</th>\r\n");
      out.write("            <th>Precio</th>\r\n");
      out.write("            <th>Cantidad</th>\r\n");
      out.write("            <th>Decisiones</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("        <c:forEach var=\"product\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" varStatus=\"loop\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <form method=\"post\" action=\"products\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"action\" value=\"edit\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"index\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    <td><input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"quantity\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required></td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Edit</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger\" onclick=\"deleteProduct(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\">Delete</button>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </form>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </c:forEach>\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function deleteProduct(index) {\r\n");
      out.write("        Swal.fire({\r\n");
      out.write("            title: 'Eliminacion de Producto',\r\n");
      out.write("            text: 'Estas seguro de eliminar este producto?',\r\n");
      out.write("            icon: 'warning',\r\n");
      out.write("            showCancelButton: true,\r\n");
      out.write("            confirmButtonColor: '#3085d6',\r\n");
      out.write("            cancelButtonColor: '#d33',\r\n");
      out.write("            confirmButtonText: 'Si, Eliminar el producto!'\r\n");
      out.write("        }).then((result) => {\r\n");
      out.write("            if (result.isConfirmed) {\r\n");
      out.write("                var form = document.createElement(\"form\");\r\n");
      out.write("                form.method = \"post\";\r\n");
      out.write("                form.action = \"products\";\r\n");
      out.write("\r\n");
      out.write("                var actionInput = document.createElement(\"input\");\r\n");
      out.write("                actionInput.type = \"hidden\";\r\n");
      out.write("                actionInput.name = \"action\";\r\n");
      out.write("                actionInput.value = \"delete\";\r\n");
      out.write("                form.appendChild(actionInput);\r\n");
      out.write("\r\n");
      out.write("                var indexInput = document.createElement(\"input\");\r\n");
      out.write("               type = \"hidden\";\r\n");
      out.write("                indexInput.name = \"index\";\r\n");
      out.write("                indexInput.value = index;\r\n");
      out.write("                form.appendChild(indexInput);\r\n");
      out.write("\r\n");
      out.write("                document.body.appendChild(form);\r\n");
      out.write("                form.submit();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
