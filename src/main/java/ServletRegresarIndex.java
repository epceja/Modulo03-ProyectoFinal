import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/regresar-index")
public class ServletRegresarIndex extends HttpServlet {

    public void init() {
        System.out.println("Regresando al index.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("index.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
