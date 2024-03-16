import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProductServlet", urlPatterns = {"/products"})
public class ProductServlet extends HttpServlet {

    private List<Product> products;

    @Override
    public void init() throws ServletException {
        super.init();
        products = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("Product", products);
        request.getRequestDispatcher("products.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null) {
            switch (action) {
                case "add":
                    addProduct(request);
                    break;
                case "edit":
                    editProduct(request);
                    break;
                case "delete":
                    deleteProduct(request);
                    break;
            }
        }

        response.sendRedirect("products.jsp");
    }

    private void addProduct(HttpServletRequest request) {
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String price = request.getParameter("price");
        String quantity = request.getParameter("quantity");

        Product product = new Product(name, id, price, quantity);
        products.add(product);
    }

    private void editProduct(HttpServletRequest request) {
        int index = Integer.parseInt(request.getParameter("index"));
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String price = request.getParameter("price");
        String quantity = request.getParameter("quantity");

        Product product = new Product(name, id, price, quantity);
        products.set(index, product);
    }

    private void deleteProduct(HttpServletRequest request) {
        int index = Integer.parseInt(request.getParameter("index"));
        products.remove(index);
    }
}