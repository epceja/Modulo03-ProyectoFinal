import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/reto-aceptado")
public class ServletRetoAceptado extends HttpServlet {

    public void init() {
        System.out.println("Servlet de reto aceptado ha iniciado");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        boolean aceptarPuente = Boolean.parseBoolean(request.getParameter("subir-puente"));
        try {
            if ( aceptarPuente ) {
                response.sendRedirect("subir-puente-si.jsp");
            }else {
                request.getSession().setAttribute("mensajeFracaso1", "¡Has rechazado subir al puente de mando!");
                request.getSession().setAttribute("mensajeFracaso2", "No atendiste las negociaciones");
                request.getSession().setAttribute("mensajeFracaso3", "¡Adiós Coyón! ... ¡Perdiste!");
                response.sendRedirect("fracaso.jsp");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
